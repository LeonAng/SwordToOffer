package 剑指offer_2;

/** 
* @author Leon 
* @version 创建时间：2017年8月26日 下午9:06:19 
* 类说明 :
* 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
*/
public class Solution11
{
	public static int NumberOf1(int n)
	{
		int result = 0;
		char[] ch = Integer.toBinaryString(n).toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] == '1')
				result++;
		}
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println(NumberOf1(4));
		System.out.println(NumberOf1(-2));
	}

}
