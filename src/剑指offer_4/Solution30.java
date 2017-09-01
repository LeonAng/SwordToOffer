package 剑指offer_4;

/** 
* @author Leon 
* @version 创建时间：2017年9月1日 下午3:02:56 
* 类说明 :
* HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
* 今天测试组开完会后,他又发话了:
* 在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
* 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
* 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
* 你会不会被他忽悠住？(子向量的长度至少是1)
*/
public class Solution30
{
	public static int FindGreatestSumOfSubArray(int[] array)
	{
		if (array.length == 1)
			return array[0];

		int result = Find(array, 0);
		return result;
	}

	private static int Find(int[] array, int start)
	{
		if (start >= array.length - 1)
		{
			return array[array.length - 1];
		}

		int count1 = Integer.MIN_VALUE;
		int count2 = 0;
		for (int i = start; i < array.length; i++)
		{
			for (int j = start; j <= i; j++)
			{
				count2 += array[j];
			}
			if (count2 >= count1)
			{
				count1 = count2;
				count2 = 0;
			}
			count2 = 0;
		}

		if (count1 <= Find(array, start + 1))
		{
			count1 = Find(array, start + 1);
		}

		//System.out.println(count1);
		return count1;
	}

	public static void main(String[] args)
	{
		int[] array = new int[] { 6, -3, -2, 7, -15, 1, 2, 2 };
		System.out.println("result: " + FindGreatestSumOfSubArray(array));
	}

}
