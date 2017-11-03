package ��ָoffer_6;

import java.util.Arrays;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����4:00:06
* @version 1.0
* ��˵�� :
* LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
* ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
* ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....
* LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
* �����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����LL����ȥ��������Ʊ����
* ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0��
*/
public class Solution45
{
	public static boolean isContinuous(int[] numbers)
	{
		if (numbers.length < 5)
		{
			return false;
		}
		Arrays.sort(numbers);
		// int start = 0;
		int i = 0;
		for (; i < numbers.length; i++)
		{
			if (numbers[i] != 0)
			{
				// start = numbers[i];
				break;
			}
		}
		int numOfZero = i;
		if (i == numbers.length - 1)
		{
			return true;
		}

		for (int j = i; j < numbers.length - 1; j++)
		{
			if (numbers[j] + 1 != numbers[j + 1])
			{
				if (numbers[j] == numbers[j + 1] - 2 && numOfZero > 0)
				{
					numOfZero--;
				}
				else if (numbers[j] == numbers[j + 1] - 3 && numOfZero > 0)
				{
					numOfZero -= 2;
				}
				else if (numbers[j] == numbers[j + 1] - 4 && numOfZero > 0)
				{
					numOfZero -= 3;
				}
				else
				{
					return false;
				}
			}
		}
		if (numOfZero < 0)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int[] num = new int[] { 1, 3, 0, 0, 5 };
		System.out.println(isContinuous(num));
	}

}
