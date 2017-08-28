package 剑指offer_1;

/**
 * @author 12083
 *输入一个链表，从尾到头打印链表每个节点的值。
 */
import java.util.ArrayList;

class ListNode
{
	int val;
	ListNode next = null;

	ListNode(int val)
	{
		this.val = val;
	}
}

public class Solution3
{
	static ArrayList<Integer> result = new ArrayList<Integer>();

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		if (listNode != null)
		{
			printListFromTailToHead(listNode.next);
			result.add(listNode.val);
		}
		return result;
	}

	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;

		ArrayList<Integer> result = printListFromTailToHead(node1);

		int length = result.size();
		for (int i = 0; i < length; i++)
		{
			System.out.println(result.get(i));
		}
	}
}
