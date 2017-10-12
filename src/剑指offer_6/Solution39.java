package ��ָoffer_6;

/** 
* @author Leon
* @date ����ʱ�䣺2017��10��12�� ����3:46:03
* @version 1.0
* ��˵�� :����һ�ö��������жϸö������Ƿ���ƽ���������
* 		����һ �ÿ����������������������ĸ߶Ȳ�ľ���ֵ������1����������������������һ��ƽ���������
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