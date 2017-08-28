package 剑指offer_1;

/**
 * @author 12083
 *大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 *n<=39
 */
public class Solution7
{
	public static int Fibonacci(int n)
	{
		int first = 0, second = 1;
		int index = 0;
		while (index != n)
		{
			int temp = first;
			first = second;
			second = temp + second;
			index++;
		}
		return first;
	}

	public static void main(String[] args)
	{
		System.out.println(Fibonacci(6));
	}
}
