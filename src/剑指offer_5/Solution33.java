package 剑指offer_5;

import java.util.ArrayList;

/** 
* @author Leon 
* @version 创建时间：2017年9月5日 下午5:01:34 
* 类说明 :
* 把只包含因子2、3和5的数称作丑数（Ugly Number）。
* 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。
* 求按从小到大的顺序的第N个丑数。
*/
public class Solution33
{
	public static int GetUglyNumber_Solution(int index)
	{
		if (index <= 0)
			return 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		/**
		 * 其核心思想是：每一个丑数必定是由之前的某个丑数与2、3或5的乘积得到的，
		 * 这样下一个丑数就用之前的丑数分别乘以2，3，5。
		 * 找出这三这样的最小的而且大于当前最大丑数的值，即为下一个要求的丑数。
		 * 
		 * 但是把之前每一个丑数都分别乘以2、3、5然后进行比较不是必须的。
		 * 可以纪录某个数的位置，在该数之前的丑数乘以2（3、5）肯定是小于当前最大丑数的。
		 * */
		while (list.size() < index)
		{
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return list.get(list.size() - 1);
	}

	public static void main(String[] args)
	{
		System.out.println(GetUglyNumber_Solution(6));
	}
}
