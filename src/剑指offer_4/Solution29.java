package ��ָoffer_4;

import java.util.Arrays;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��9��1�� ����11:01:41 
* ��˵�� :
* ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
* ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
