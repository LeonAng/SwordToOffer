package 剑指offer_6;

import java.util.ArrayList;

/** 
* @author Leon
* @date 创建时间：2017年11月3日 下午3:00:39
* @version 1.0
* 类说明 :
* 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
* 对应每个测试案例，输出两个数，小的先输出。
*/
public class Solution42
{

	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (array.length < 2)
		{
			return result;
		}
		int first = 0, second = 1;
		int sumTmp = 0;
		while (array[first] < sum / 2)
		{
			sumTmp = array[first] + array[second];
			// System.out.println(sumTmp);
			if (sumTmp == sum)
			{
				result.add(array[first]);
				result.add(array[second]);
				break;
			}
			else if (sumTmp < sum && second < array.length - 1)
			{
				second++;
			}
			else
			{
				first++;
				second = first + 1;
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		int[] array = new int[] { 1, 2, 4, 7, 11, 15 };
		ArrayList<Integer> list = FindNumbersWithSum(array, 15);
		System.out.println(list.toString());
	}

}
