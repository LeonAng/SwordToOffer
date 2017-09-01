package 剑指offer_4;

import java.util.*;

/** 
* @author Leon 
* @version 创建时间：2017年9月1日 上午11:46:22 
* 类说明 :
* 输入n个整数，找出其中最小的K个数。
* 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
*/
public class Solution29
{
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Arrays.sort(input);
		// System.out.println(Arrays.toString(input));
		
		/*去重*/
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < input.length; i++)
		{
			set.add(input[i]);
		}
		
		/*放回容器*/
		Iterator<Integer> it = set.iterator();
		int flag=0;
		if(k>set.size())
		{
			return result;
		}
		while (it.hasNext()&&flag<k)
		{
			int num = it.next();
			result.add(num);
			flag++;
		}		
		return result;
	}

	public static void main(String[] args)
	{
		int[] input = new int[] { 4, 5, 1, 6, 2, 7, 1, 1 };
		ArrayList<Integer> list = GetLeastNumbers_Solution(input, 4);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
