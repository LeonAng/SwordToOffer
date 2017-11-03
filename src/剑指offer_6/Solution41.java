package ��ָoffer_6;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����2:07:31
* @version 1.0
* ��˵�� :
* ������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
*/
import java.util.ArrayList;

public class Solution41
{
	/**
	 * ��ʼ��start=1��end=2; start��end���к�С��sum��end++;����sum��start++; 
	 * ��start���ӵ� sum/2 ʱֹͣ
	 */
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (sum < 1)
		{
			return result;
		}

		int start = 1, end = 2, sumTmp = 0;
		while (start <= sum / 2)
		{
			sumTmp = getSum(start, end);
			if (sumTmp == sum)
			{
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i = start; i <= end; i++)
				{
					list.add(i);
				}
				result.add(list);
				start++;
				end++;
			}
			else if (sumTmp < sum)
			{
				end++;
			}
			else
			{
				start++;
			}
		}

		return result;
	}

	private static int getSum(int start, int end)
	{
		int sumTmp = 0;
		for (int i = start; i <= end; i++)
		{
			sumTmp += i;
		}
		return sumTmp;
	}

	public static void main(String[] args)
	{
		System.out.println(FindContinuousSequence(500).toString());
	}

}
