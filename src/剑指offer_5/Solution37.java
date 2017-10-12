package 剑指offer_5;

import java.util.Arrays;

/**
 * @author Leon
 * @version 创建时间：2017年9月28日 类说明 : 统计一个数字在排序数组中出现的次数。
 */
public class Solution37
{
	public int GetNumberOfK(int[] array, int k)
	{
		int foo = Arrays.binarySearch(array, k);
		if (foo < 0)
		{
			return 0;
		} else
		{
			int result = 1;
			for (int i = foo - 1; i >= 0 && array[i] == k; i--)
			{
				result++;
			}
			for (int i = foo + 1; i <= array.length - 1 && array[i] == k; i++)
			{
				result++;
			}
			return result;
		}
	}
}
