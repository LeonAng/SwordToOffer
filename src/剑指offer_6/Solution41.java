package 剑指offer_6;

/** 
* @author Leon
* @date 创建时间：2017年11月3日 下午2:07:31
* @version 1.0
* 类说明 :
* 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
*/
import java.util.ArrayList;

public class Solution41
{
	/**
	 * 初始化start=1，end=2; start到end序列和小于sum，end++;大于sum，start++; 
	 * 当start增加到 sum/2 时停止
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
