package 剑指offer_8;

/** 
* @author Leon
* @date 创建时间：2018年3月5日 下午6:16:31
* @version 1.0
* 类说明 :
* 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
* 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
*/
public class Solution57
{
	public TreeLinkNode GetNext(TreeLinkNode pNode)
	{
		return pNode;

	}
}

class TreeLinkNode
{
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val)
	{
		this.val = val;
	}
}