package ��ָoffer_7;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��11�� ����4:29:39
* @version 1.0
* ��˵�� :
* ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����1
*/
public class Solution51
{
	/**
	 *����һ�����󣬶Խ�����1��
	 */
	public int[] multiply(int[] A)
	{
		int[] B = new int[A.length];
		if (A.length == 0)
		{
			return B;
		}
		// �ȼ����°����
		B[0] = 1;
		for (int i = 1; i < B.length; i++)
		{
			B[i] = B[i - 1] * A[i - 1];
		}
		// �ٳ����ϰ������
		int tmp = 1;
		for (int i = B.length - 2; i >= 0; i--)
		{
			tmp *= A[i + 1];
			B[i] *= tmp;
		}
		return B;
	}
}
