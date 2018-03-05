package 剑指offer_8;

/** 
* @author Leon
* @date 创建时间：2018年3月5日 下午5:09:08
* @version 1.0
* 类说明 :
* 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
* 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/
public class Solution56
{
	public static void main(String[] args)
	{
		ListNode n0 = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(4);
		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ListNode node = deleteDuplication(n0);
		while (node != null)
		{
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode deleteDuplication(ListNode pHead)
	{
		if (pHead == null || pHead.next == null)
		{ // 只有0个或1个结点，则返回
			return pHead;
		}
		if (pHead.val == pHead.next.val)
		{ // 当前结点是重复结点
			ListNode pNode = pHead.next;
			while (pNode != null && pNode.val == pHead.val)
			{
				// 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
				pNode = pNode.next;
			}
			return deleteDuplication(pNode); // 从第一个与当前结点不同的结点开始递归
		}
		else
		{ // 当前结点不是重复结点
			pHead.next = deleteDuplication(pHead.next); // 保留当前结点，从下一个结点开始递归
			return pHead;
		}
	}
}

class ListNode
{
	int val;
	ListNode next = null;

	ListNode(int val)
	{
		this.val = val;
	}
}