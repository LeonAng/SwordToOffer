package ��ָoffer_8;

/** 
* @author Leon
* @date ����ʱ�䣺2018��3��5�� ����6:16:31
* @version 1.0
* ��˵�� :
* ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
* ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
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