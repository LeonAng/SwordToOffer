package ��ָoffer_6;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����5:09:22
* @version 1.0
* ��˵�� :
* ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
*/
public class Solution47
{
	/**
	 * ����˼·��
	 *  1.�������߼���Ķ�·����ʵ�ֵݹ���ֹ��
	 *  2.��n==0ʱ��(n>0)&&((sum+=Sum_Solution(n-1))>0)ִֻ��ǰ����жϣ�Ϊfalse��Ȼ��ֱ�ӷ���0��
	 *  3.��n>0ʱ��ִ��sum+=Sum_Solution(n-1)��ʵ�ֵݹ����Sum_Solution(n)��
	 */
	public static int Sum_Solution(int n)
	{
		int sum = n;
		@SuppressWarnings("unused")
		boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(Sum_Solution(3));
	}
}
