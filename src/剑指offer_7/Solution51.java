package 剑指offer_7;

/** 
* @author Leon
* @date 创建时间：2017年11月11日 下午4:29:39
* @version 1.0
* 类说明 :
* 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。1
*/
public class Solution51
{
	/**
	 *看成一个矩阵，对角线是1，
	 */
	public int[] multiply(int[] A)
	{
		int[] B = new int[A.length];
		if (A.length == 0)
		{
			return B;
		}
		// 先计算下半矩阵
		B[0] = 1;
		for (int i = 1; i < B.length; i++)
		{
			B[i] = B[i - 1] * A[i - 1];
		}
		// 再乘上上半个矩阵
		int tmp = 1;
		for (int i = B.length - 2; i >= 0; i--)
		{
			tmp *= A[i + 1];
			B[i] *= tmp;
		}
		return B;
	}
}
