package ��ָoffer_8;

/** 
* @author Leon
* @date ����ʱ�䣺2018��3��5�� ����5:09:08
* @version 1.0
* ��˵�� :
* ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
* ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
		{ // ֻ��0����1����㣬�򷵻�
			return pHead;
		}
		if (pHead.val == pHead.next.val)
		{ // ��ǰ������ظ����
			ListNode pNode = pHead.next;
			while (pNode != null && pNode.val == pHead.val)
			{
				// ����ֵ�뵱ǰ�����ͬ��ȫ�����,�ҵ���һ���뵱ǰ��㲻ͬ�Ľ��
				pNode = pNode.next;
			}
			return deleteDuplication(pNode); // �ӵ�һ���뵱ǰ��㲻ͬ�Ľ�㿪ʼ�ݹ�
		}
		else
		{ // ��ǰ��㲻���ظ����
			pHead.next = deleteDuplication(pHead.next); // ������ǰ��㣬����һ����㿪ʼ�ݹ�
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