package 剑指offer_6;

/** 
* @author Leon
* @date 创建时间：2017年11月3日 下午3:26:48
* @version 1.0
* 类说明 :
* 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
* 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
* 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
* 是不是很简单？OK，搞定它！
* 
*/
public class Solution43
{
	public static String LeftRotateString(String str, int n)
	{
		char[] foo = str.toCharArray();
		char[] result = new char[str.length()];

		int j = 0;
		for (int i = n; i < str.length(); i++)
		{
			result[j] = foo[i];
			j++;
		}
		for (int i = 0; j < str.length(); j++, i++)
		{
			result[j] = foo[i];
		}

		return String.valueOf(result);
	}

	public static void main(String[] args)
	{
		System.out.println(LeftRotateString("nice_to_meet_you_", 4));
	}

}
