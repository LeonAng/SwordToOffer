package 剑指offer_2;
/**
 * @author Leon
 * @version 创建时间：2017年8月28日 上午9:51:29 
 * 类说明 : 输入两棵二叉树A，B，判断B是不是A的子结构。
 *       （ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution17
{
	public static boolean HasSubtree(TreeNode root1, TreeNode root2)
	{
		if (root2 == null) return false;
		if (root1 == null && root2 != null) return false;
		
		boolean flag = false;
		if (root1.val == root2.val)
		{
			flag = isSubTree(root1, root2);//以这个根节点为为起点判断是否与Tree2完全相同
		}
		if (!flag)//不包含则分别以左右子节点为起点判断
		{
			flag = HasSubtree(root1.left, root2);
			if (!flag)
			{
				flag = HasSubtree(root1.right, root2);
			}
		}
		return flag;
	}

	private static boolean isSubTree(TreeNode root1, TreeNode root2)
	{
		if (root2 == null) return true;
		if (root1 == null && root2 != null) return false;
		
		if (root1.val == root2.val)
		{
			return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
		} else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		TreeNode root1 = new TreeNode(0);
		TreeNode root2 = new TreeNode(2);
		root1.left = new TreeNode(1);
		root1.right = new TreeNode(2);
		root1.right.left = new TreeNode(3);
		root1.right.right = new TreeNode(4);
		root2.left = new TreeNode(3);
		root2.right = new TreeNode(4);
		System.out.println(HasSubtree(root1, root2));
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