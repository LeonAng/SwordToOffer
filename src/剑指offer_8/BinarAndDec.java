package 剑指offer_8;

/** 
* @author Leon
* @date 创建时间：2018年3月6日 下午3:42:23
* @version 1.0
* 类说明 :二进制十进制互相转化
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
