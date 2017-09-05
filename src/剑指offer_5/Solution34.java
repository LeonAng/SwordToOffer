package 剑指offer_5;

/** 
* @author Leon 
* @version 创建时间：2017年9月5日 下午8:26:20 
* 类说明 :
* 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
*/
public class Solution34
{
	public static int FirstNotRepeatingChar(String str)
	{
		char[] letters = str.toCharArray();
		boolean flag=false;
		for(int i = 0;i<letters.length;i++)
		{
			char tmp=letters[i];
			flag=false;
			for(int j=0;j<letters.length;j++)
			{
				if(tmp==letters[j]&&j!=i)
				{
					flag=true;//有重复
				}
			}
			if(flag==false)
			{
				return str.indexOf(tmp);
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		System.out.println(FirstNotRepeatingChar("googgle"));
	}

}
