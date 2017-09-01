package ��ָoffer_4;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��31�� ����10:44:06 
* ��˵�� :
* ����һ�ö��������������ö���������ת����һ�������˫������
* Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
*/
public class Solution26
{
	public static TreeNode Convert(TreeNode pRootOfTree)
	{
		if (pRootOfTree == null)
			return null;
		if (pRootOfTree.left == null && pRootOfTree.right == null)
			return pRootOfTree;

		/* �ҵ����������ڵ�,����������� */
		TreeNode leftNodeHead = Convert(pRootOfTree.left);
		if(leftNodeHead!=null)
		{
			TreeNode nodeTemp = leftNodeHead;
			while (nodeTemp.right != null)
			{
				nodeTemp = nodeTemp.right;
			}
			nodeTemp.right = pRootOfTree;
			pRootOfTree.left = nodeTemp;
		}
		else
		{
			leftNodeHead=pRootOfTree;
		}
		

		/* �ҵ���������С�ڵ�,���������ұ� */
		TreeNode rightNodeHead = Convert(pRootOfTree.right);
		if(rightNodeHead!=null)
		{
			rightNodeHead.left = pRootOfTree;
			pRootOfTree.right = rightNodeHead;
		}
		else
		{
			pRootOfTree.right = rightNodeHead;
		}
		
		return leftNodeHead;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(9);
		root.right = new TreeNode(18);
		root.right.left = new TreeNode(15);
		root.right.left.right = new TreeNode(17);
		root.right.left.right.left = new TreeNode(16);
		root.right.right = new TreeNode(19);

		TreeNode result = Convert(root);
		while(result!=null)
		{
			System.out.print(result.val+" ");
			result=result.right;
		}
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
