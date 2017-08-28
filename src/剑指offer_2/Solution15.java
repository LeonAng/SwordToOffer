package 剑指offer_2;

/** 
* @author Leon 
* @version 创建时间：2017年8月27日 下午2:56:41 
* 类说明 :
* 输入一个链表，反转链表后，输出链表的所有元素。
*/

public class Solution15
{
	public static ListNode ReverseList(ListNode head)
	{
		ListNode pre = null;// 用来保存已经反序的第一个结点
		ListNode next = null;// 用来保存待反序的第一个节点
		while (head != null)
		{
			next = head.next;// 首先记录当前节点的下一个节点，（保存起来）

			head.next = pre;// 让当前节点指向前一个节点，因为要反序
			pre = head;// 反转

			head = next;// 让下一个节点，取代当前节点
		}
		return pre;
	}

	public static void main(String[] args)
	{
		ListNode root = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		root.next = node1;
		node1.next = node2;
		node2.next = node3;

		root = ReverseList(root);
		while (root != null)
		{
			System.out.print(root.val + "	");
			root = root.next;
		}
	}

}
/*
 * class ListNode { int val; ListNode next = null;
 * 
 * ListNode(int val) { this.val = val; } }
 */