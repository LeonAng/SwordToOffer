package ��ָoffer_6;

import java.util.Arrays;

/** 
* @author Leon
* @date ����ʱ�䣺2017��10��12�� ����4:35:41
* @version 1.0
* ��˵�� :
* һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
* 
*/
// num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
// ��num1[0],num2[0]����Ϊ���ؽ��
public class Solution40
{
	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[])
	{
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}

		int flag = 0;
		for (int i = 0; i < array.length - 1;)
		{
			if (array[i] == array[i + 1])
			{
				i = i + 2;
			}
			else
			{
				if (flag == 0)
				{
					num1[0] = array[i];
					flag++;
				}
				else
				{
					num2[0] = array[i];
					flag++;
				}
				i++;
			}
		}
		if (flag == 1)
		{
			num2[0] = array[array.length - 1];
		}
	}

	public static void main(String[] args)
	{
		int[] array = new int[] { 2, 4, 3, 6, 3, 2, 5, 6 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(array, num1, num2);
		System.out.println("\n" + "result:" + num1[0] + " " + num2[0]);
	}

}
