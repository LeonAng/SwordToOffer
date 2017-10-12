package 剑指offer_6;

/** 
* @author Leon
* @date 创建时间：2017年10月12日 下午3:46:03
* @version 1.0
* 类说明 :输入一棵二叉树，判断该二叉树是否是平衡二叉树。
* 		它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
* 			   1
 * 		2			 3
 * 	 4		5	 6	
*/
public class Solution39
{
	public static boolean IsBalanced_Solution(TreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		if(Math.abs(TreeDepth(root.left)-TreeDepth(root.right))<=1 && IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right))
		{
			return true;
		}
		return false;
	}

	private static int TreeDepth(TreeNode root)
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

		System.out.println(IsBalanced_Solution(root));

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