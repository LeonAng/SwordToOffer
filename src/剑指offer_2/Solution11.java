package ��ָoffer_2;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��26�� ����9:06:19 
* ��˵�� :
* ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
