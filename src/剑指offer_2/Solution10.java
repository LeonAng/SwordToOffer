package ��ָoffer_2;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��26�� ����8:52:58 
* ��˵�� :
* ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
* ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
*/
public class Solution10
{
	public static int RectCover(int target)
	{
		if (target == 0)
			return 0;
		if (target == 1)
			return 1;
		if (target == 2)
			return 2;
		return RectCover(target - 1) + RectCover(target - 2);
	}

	public static void main(String[] args)
	{
		System.out.println(RectCover(2));
	}
}
