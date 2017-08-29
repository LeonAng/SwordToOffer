package 剑指offer_3;

/** 
* @author Leon 
* @version 创建时间：2017年8月29日 上午10:42:45 
* 类说明 :
* 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
* 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
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
		for (; i < end; i++) // 找到右子树起点
		{
			if (sequence[i] > sequence[end])
				break;
		}

		for (int j = i; j < end; j++)// 判断右子树是否都大于根节点
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
