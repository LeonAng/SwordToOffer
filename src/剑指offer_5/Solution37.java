package ��ָoffer_5;

import java.util.Arrays;

/**
 * @author Leon
 * @version ����ʱ�䣺2017��9��28�� ��˵�� : ͳ��һ�����������������г��ֵĴ�����
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
