package ��ָoffer_3;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��28�� ����5:33:25 
* ��˵�� :
* �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution22
{
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null)
			return result;

		queue.add(root);
		while (!queue.isEmpty())
		{
			TreeNode node = queue.poll();
			if (node.left != null)
			{
				queue.offer(node.left);
			}
			if (node.right != null)
			{
				queue.offer(node.right);
			}
			result.add(node.val);
		}
		return result;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(4);

		ArrayList<Integer> list = PrintFromTopToBottom(root);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
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