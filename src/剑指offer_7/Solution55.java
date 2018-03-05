package 剑指offer_7;

/** 
* @author Leon
* @date 创建时间：2018年3月5日 下午4:13:26
* @version 1.0
* 类说明 :
* 一个链表中包含环，请找出该链表的环的入口结点。
*/
public class Solution55
{
	public static void main(String[] args)
	{
		ListNode n0 = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2;

		System.out.println(EntryNodeOfLoop(n0).val);

	}

	public static ListNode EntryNodeOfLoop(ListNode pHead)
	{
		if (pHead == null || pHead.next == null)
			return null;
		ListNode p1 = pHead;
		ListNode p2 = pHead;
		while (p2 != null && p2.next != null)
		{
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2)
			{
				p1 = pHead;
				while (p1 != p2)
				{
					p1 = p1.next;
					p2 = p2.next;
				}
				if (p1 == p2)
					return p1;
			}
		}
		return null;

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
