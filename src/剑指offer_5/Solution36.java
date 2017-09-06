package 剑指offer_5;

/** 
* @author Leon 
* @version 创建时间：2017年9月6日 下午5:34:56 
* 类说明 :
* 输入两个链表，找出它们的第一个公共结点。
*/
public class Solution36
{
	public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2)
	{
		/*
		 * 找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走 
		 * （因为2个链表用公共的尾部）
		 */
		int length1 = 0, length2 = 0;
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while (p1 != null)
		{
			length1++;
			p1 = p1.next;
		}
		while (p2 != null)
		{
			length2++;
			p2 = p2.next;
		}

		if (length1 > length2)
		{
			int step = length1 - length2;
			while (step > 0)
			{
				pHead1 = pHead1.next;
				step--;
			}
		} else
		{
			int step = length2 - length1;
			while (step > 0)
			{
				pHead2 = pHead2.next;
				step--;
			}
		}

		while (pHead1 != null)
		{
			if (pHead1 == pHead2)
			{
				return pHead1;
			} else
			{
				pHead1 = pHead1.next;
				pHead2 = pHead2.next;
			}
		}
		return null;
	}

	public static void main(String[] args)
	{
		ListNode root1 = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		root1.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode root2 = new ListNode(2);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		root2.next = node5;
		node5.next = node6;
		node6.next = node3;

		System.out.println(FindFirstCommonNode(root1, root2).val);// 输出：3
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