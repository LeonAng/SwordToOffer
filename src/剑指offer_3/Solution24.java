package 剑指offer_3;

/** 
* @author Leon 
* @version 创建时间：2017年8月29日 上午11:36:20 
* 类说明 :
* 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
* 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
*/
import 剑指offer_3.Solution22;
import java.util.ArrayList;

@SuppressWarnings("unused")

public class Solution24
{
	private static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<Integer> arr = new ArrayList<Integer>();
	private static int num = 0;

	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target)
	{
		if (root == null)
		{
			return result;
		}

		boolean isLeaf = (root.left == null && root.right == null);
		num += root.val;
		arr.add(root.val);
		if (num == target && isLeaf)
		{
			ArrayList<Integer> path = new ArrayList<Integer>();
			for (int i = 0; i < arr.size(); i++)
			{
				path.add(arr.get(i));
			}
			result.add(path);
		}
		
		if (num < target && root.left != null)
		{
			FindPath(root.left, target);
		}
		if (num < target && root.right != null)
		{
			FindPath(root.right, target);
		}
		num -= root.val;
		arr.remove(arr.size() - 1);
		return result;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(4);

		System.out.println(FindPath(root, 5).size());
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