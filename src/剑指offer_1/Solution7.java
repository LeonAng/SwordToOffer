package ��ָoffer_1;

/**
 * @author 12083
 *��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
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
