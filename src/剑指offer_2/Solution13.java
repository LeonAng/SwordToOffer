package ��ָoffer_2;
/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��26�� ����9:39:25 
* ��˵�� :
* ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
* ���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
*/
public class Solution13
{
	public static void reOrderArray(int [] array) 
	{
        int[] temp = new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++)
        {
        	if(array[i]%2!=0)
        	{
        		temp[index]=array[i];
        		index++;
        	}
        }
        for(int i=0;i<array.length;i++)
        {
        	if(array[i]%2==0)
        	{
        		temp[index]=array[i];
        		index++;
        	}
        }
        for(int i=0;i<array.length;i++)
        {
        	array[i]=temp[i];
        }
    }
	
	public static void main(String[] args)
	{
		int[] array = new int[] {1,2,3,4,5,6,7,8};
		reOrderArray(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"	");
		}
		
	}
}
