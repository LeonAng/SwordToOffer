package ��ָoffer_8;

/** 
* @author Leon
* @date ����ʱ�䣺2018��3��6�� ����3:42:23
* @version 1.0
* ��˵�� :������ʮ���ƻ���ת��
* 
*/
public class BinarAndDec
{
	public static void main(String[] args)
	{
		System.out.println(BinaryTodec(101));
		System.out.println(DecToBinary(8));
	}

	private static int BinaryTodec(int i)
	{
		int result = 0;
		int count = 0;
		while (i > 0)
		{
			result += i % 10 * Math.pow(2, count);
			count++;
			i = i / 10;
		}
		return result;
	}

	private static int DecToBinary(int i)
	{
		int result = 0;
		int[] result1 = new int[20];
		int count = 0;
		while (i != 0)
		{
			result1[count] = i % 2;
			i = i / 2;
			count++;
		}
		for (int j = 0; j < result1.length; j++)
		{
			result += Math.pow(10, j) * result1[j];
		}
		return result;
	}

}
