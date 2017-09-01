package 剑指offer_4;

import java.util.Arrays;

/** 
* @author Leon 
* @version 创建时间：2017年9月1日 上午11:01:41 
* 类说明 :
* 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
* 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
*/
public class Solution29
{
	public static int MoreThanHalfNum_Solution(int[] array)
	{
		if(array.length==0)
			return 0;
		if(array.length==1)
			return array[0];
		
		int limit = array.length/2;
		Arrays.sort(array);
		//System.out.println(Arrays.toString(array));
		int count=1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]==array[i-1])
			{
				count++;
			}
			else
			{
				if(count>limit)
				{
					return array[i-1];	
				}
				else
				{
					count=1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int[] array =new int[] {};
		System.out.println(MoreThanHalfNum_Solution(array));
	}
}
