package ��ָoffer_4;

import java.util.*;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��9��1�� ����11:46:22 
* ��˵�� :
* ����n���������ҳ�������С��K������
* ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
*/
public class Solution29
{
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Arrays.sort(input);
		// System.out.println(Arrays.toString(input));
		
		/*ȥ��*/
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < input.length; i++)
		{
			set.add(input[i]);
		}
		
		/*�Ż�����*/
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
