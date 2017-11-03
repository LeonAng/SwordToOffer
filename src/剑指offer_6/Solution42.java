package ��ָoffer_6;

import java.util.ArrayList;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����3:00:39
* @version 1.0
* ��˵�� :
* ����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
* ��Ӧÿ�����԰����������������С���������
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
