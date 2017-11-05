package ��ָoffer_7;

import java.util.ArrayList;
import java.util.Iterator;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��5�� ����3:11:38
* @version 1.0
* ��˵�� :
* ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� 
* ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
*  ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
*/
public class Solution50
{
	// Parameters:
	// numbers: an array of integers
	// length: the length of array numbers
	// duplication: (Output) the duplicated number in the array number,length of
	// duplication array is 1,so using duplication[0] = ? in implementation;
	// Here duplication like pointor in C/C++, duplication[0] equal *duplication in
	// C/C++
	// ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
	// Return value: true if the input is valid, and there are some duplications in
	// the array number
	// otherwise false
	public static boolean duplicate(int numbers[], int length, int[] duplication)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++)
		{
			Iterator<Integer> listIter = list.iterator();
			while (listIter.hasNext())
			{
				if (listIter.next() == numbers[i])
				{
					duplication[0] = numbers[i];
					return true;
				}
			}
			list.add(numbers[i]);
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] numbers = new int[] { 2, 3, 1, 0, 2, 5, 3 };
		int[] duplication = new int[1];
		if (duplicate(numbers, numbers.length, duplication))
		{
			System.out.println("��һ���ظ�������Ϊ: " + duplication[0]);
		}
		else
		{
			System.out.println("ľ���ظ������ְ�");
		}
	}
}
