package ��ָoffer_1;
/**
 * @author 12083
 *��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
 *����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 *��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Solution6
{
	public static int minNumberInRotateArray(int [] array) 
	{
		if(array.length<=0)
		{
			return 0;
		}
		else
		{
			if(array.length==1)
			{
				return array[0];
		    }
			
			for(int i=0;i<array.length-1;i++)
			{
	            if(array[i]>array[i+1])
	            {
	                return array[i+1];
	            }
	            else
	            {
	                if(i==array.length-2)
	                {
	                    return array[0];
	                }
	            }
	        }
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		int[] array = new int[]{3,4,5,1,2};
		System.out.println(minNumberInRotateArray(array));
	}
}
