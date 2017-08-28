package 剑指offer_1;

/**
 * @author 12083
 *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
// Definition for binary tree
class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x)
	{
		val = x;
	}
}

public class Solution4
{
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in)
	{
		TreeNode root = reConstructBinaryTree2(pre, 0, pre.length - 1, in, 0, in.length - 1);
		return root;
	}

	private static TreeNode reConstructBinaryTree2(int[] pre, int startPre, int endPre, int[] in, int startIn,
			int endIn)
	{

		if (startPre > endPre || startIn > endIn)
		{
			return null;
		}

		TreeNode root = new TreeNode(pre[startPre]);
		for (int i = startIn; i <= endIn; i++)
		{
			if (in[i] == pre[startPre])// 找到当前根节点在中序遍历中的位置
			{
				root.left = reConstructBinaryTree2(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				root.right = reConstructBinaryTree2(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
			}
		}
		return root;
	}

	public static void main(String[] args)
	{
		int[] pre = new int[] { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = new int[] { 4, 7, 2, 1, 5, 3, 8, 6 };

		TreeNode root = reConstructBinaryTree(pre, in);
		System.out.println(root.right.val);
	}
}
