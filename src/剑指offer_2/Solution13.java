package 剑指offer_2;
/** 
* @author Leon 
* @version 创建时间：2017年8月26日 下午9:39:25 
* 类说明 :
* 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
* 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
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
