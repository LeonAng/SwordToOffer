package ��ָoffer_3;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��29�� ����10:42:45 
* ��˵�� :
* ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
* ����������Yes,�������No���������������������������ֶ�������ͬ��
*/
public class Solution23
{
	public static boolean VerifySquenceOfBST(int[] sequence)
	{
		if (sequence.length == 0)
			return false;

		return IsBST(sequence, 0, sequence.length - 1);
	}

	private static boolean IsBST(int[] sequence, int start, int end)
	{
		if (end <= start)
			return true;

		int i = start;
		for (; i < end; i++) // �ҵ����������
		{
			if (sequence[i] > sequence[end])
				break;
		}

		for (int j = i; j < end; j++)// �ж��������Ƿ񶼴��ڸ��ڵ�
		{
			if (sequence[j] < sequence[end])
				return false;
		}
		return IsBST(sequence, start, i - 1) && IsBST(sequence, i, end - 1);
	}

	public static void main(String[] args)
	{
		int[] sequence = new int[] { 2, 9, 5, 16, 17, 15, 19, 18, 12 };
		System.out.println(VerifySquenceOfBST(sequence));
	}
}
