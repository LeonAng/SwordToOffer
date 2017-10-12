package 剑指offer_6;

/** 
* @author Leon
* @date 创建时间：2017年10月12日 下午4:35:41
* @version 1.0
* 类说明 :
* 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
* 
*/
// num1,num2分别为长度为1的数组。传出参数
// 将num1[0],num2[0]设置为返回结果
public class Solution40
{
	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[])
	{
		
	}

	public static void main(String[] args)
	{
		int[] array = new int[] { 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 7 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(array, num1, num2);
		System.out.println(num1[0] + " " + num2[0]);
	}

}
