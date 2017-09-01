package ��ָoffer_4;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��9��1�� ����3:02:56 
* ��˵�� :
* HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
* ��������鿪����,���ַ�����:
* �ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
* ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
* ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
* ��᲻�ᱻ������ס��(�������ĳ���������1)
*/
public class Solution30
{
	public static int FindGreatestSumOfSubArray(int[] array)
	{
		if (array.length == 1)
			return array[0];

		int result = Find(array, 0);
		return result;
	}

	private static int Find(int[] array, int start)
	{
		if (start >= array.length - 1)
		{
			return array[array.length - 1];
		}

		int count1 = Integer.MIN_VALUE;
		int count2 = 0;
		for (int i = start; i < array.length; i++)
		{
			for (int j = start; j <= i; j++)
			{
				count2 += array[j];
			}
			if (count2 >= count1)
			{
				count1 = count2;
				count2 = 0;
			}
			count2 = 0;
		}

		if (count1 <= Find(array, start + 1))
		{
			count1 = Find(array, start + 1);
		}

		//System.out.println(count1);
		return count1;
	}

	public static void main(String[] args)
	{
		int[] array = new int[] { 6, -3, -2, 7, -15, 1, 2, 2 };
		System.out.println("result: " + FindGreatestSumOfSubArray(array));
	}

}
