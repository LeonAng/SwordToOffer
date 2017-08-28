package ��ָoffer_2;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��28�� ����10:58:52 
* ��˵�� :���������Ķ�����������任ΪԴ�������ľ���
* ��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
*/
public class Solution18
{
	public static void Mirror(TreeNode root)
	{
		if (root == null)
			return;
		TreeNode tmp = null;
		tmp = root.right;
		root.right = root.left;
		root.left = tmp;
		Mirror(root.left);
		Mirror(root.right);
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(4);
		Mirror(root);
	}
}

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/