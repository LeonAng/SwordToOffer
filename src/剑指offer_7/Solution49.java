package 剑指offer_7;

/** 
* @author Leon
* @date 创建时间：2017年11月4日 下午4:14:08
* @version 1.0
* 类说明 :
* 题目描述
	将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
     输入描述:
	输入一个字符串,包括数字字母符号,可以为空
     输出描述:
	如果是合法的数值表达则返回该数字，否则返回0
     示例1
	输入
	+2147483647
    	1a33
	输出
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
