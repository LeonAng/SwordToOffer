package ��ָoffer_2;
/**
 * @author Leon
 * @version ����ʱ�䣺2017��8��28�� ����9:51:29 
 * ��˵�� : �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 *       ��ps������Լ��������������һ�������ӽṹ��
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
			flag = isSubTree(root1, root2);//��������ڵ�ΪΪ����ж��Ƿ���Tree2��ȫ��ͬ
		}
		if (!flag)//��������ֱ��������ӽڵ�Ϊ����ж�
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