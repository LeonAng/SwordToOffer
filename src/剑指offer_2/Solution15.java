package ��ָoffer_2;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��27�� ����2:56:41 
* ��˵�� :
* ����һ��������ת�����������������Ԫ�ء�
*/

public class Solution15
{
	public static ListNode ReverseList(ListNode head)
	{
		ListNode pre = null;// ���������Ѿ�����ĵ�һ�����
		ListNode next = null;// �������������ĵ�һ���ڵ�
		while (head != null)
		{
			next = head.next;// ���ȼ�¼��ǰ�ڵ����һ���ڵ㣬������������

			head.next = pre;// �õ�ǰ�ڵ�ָ��ǰһ���ڵ㣬��ΪҪ����
			pre = head;// ��ת

			head = next;// ����һ���ڵ㣬ȡ����ǰ�ڵ�
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