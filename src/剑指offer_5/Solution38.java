package ��ָoffer_5;

/**
 * @author Leon
 * @date ����ʱ�䣺2017��10��12�� ����3:19:23
 * @version 1.0 ��˵�� :
 * ����һ�ö����������������ȡ�
 * �Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
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