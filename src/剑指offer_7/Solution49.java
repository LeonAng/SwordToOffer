package ��ָoffer_7;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��4�� ����4:14:08
* @version 1.0
* ��˵�� :
* ��Ŀ����
	��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
     ��������:
	����һ���ַ���,����������ĸ����,����Ϊ��
     �������:
	����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
     ʾ��1
	����
	+2147483647
    	1a33
	���
	2147483647
    	0
*/
public class Solution49
{
	public static int StrToInt(String str)
	{
		if (str.length() == 0)
		{
			return 0;
		}

		char[] foo = str.toCharArray();
		int result = 0;
		// System.out.println(foo[0]);

		for (int i = 1; i < foo.length; i++)
		{
			if (foo[i] > '9' || foo[i] < '0')
			{
				return 0;
			}
		}

		if (foo[0] == '+' || foo[0] == '-')
		{
			int digit = str.length() - 1;
			for (int i = 0; i < digit; i++)
			{
				result += (foo[digit - i] - '0') * (int) Math.pow(10, i);
				// System.out.println(result);
			}
			if (foo[0] == '+')
			{
				return result;
			}
			else
			{
				return -1 * result;
			}

		}
		else if (foo[0] <= '9' || foo[0] >= '0')
		{
			int digit = str.length();
			for (int i = 0; i < digit; i++)
			{
				result += (foo[digit - i - 1] - '0') * (int) Math.pow(10, i);
				// System.out.println(result);
			}
			return result;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(StrToInt("+13214"));
	}
}
