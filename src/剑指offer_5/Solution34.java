package ��ָoffer_5;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��9��5�� ����8:26:20 
* ��˵�� :
* ��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
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
					flag=true;//���ظ�
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
