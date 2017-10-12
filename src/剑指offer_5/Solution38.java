package 剑指offer_5;

/**
 * @author Leon
 * @date 创建时间：2017年10月12日 下午3:19:23
 * @version 1.0 类说明 :
 * 输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * 			  1
 * 		2			 3
 * 	 4		5	 6		
 */
public class Solution38
{
	public static int TreeDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		else if (root.left == null && root.right == null)
		{
			return 1;
		}
		else
		{
			if (TreeDepth(root.left) > TreeDepth(root.right))
			{
				return 1 + TreeDepth(root.left);
			}
			else
			{
				return 1 + TreeDepth(root.right);
			}

		}

	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);

		System.out.println(TreeDepth(root));

	}
}

class TreeNode
{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val)
	{
		this.val = val;
	}
}