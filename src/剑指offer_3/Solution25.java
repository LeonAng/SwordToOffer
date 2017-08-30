package ��ָoffer_3;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��29�� ����2:51:20 
* ��˵�� :
* ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
* ���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
*/
public class Solution25
{
	public static RandomListNode Clone(RandomListNode pHead)
	{
		if (pHead == null)
			return null;

		RandomListNode result = new RandomListNode(pHead.label);
		RandomListNode node1 = result;
		RandomListNode node2 = result;
		RandomListNode pHead1 = pHead;
		RandomListNode pHead2 = pHead;

		while (pHead1.next != null)
		{
			node1.next = new RandomListNode(pHead1.next.label);
			node1 = node1.next;
			pHead1 = pHead1.next;
		}
		while (pHead2 != null)
		{
			if (pHead2.random != null)
			{
				node2.random = new RandomListNode(pHead2.random.label);
			}
			node2 = node2.next;
			pHead2 = pHead2.next;
		}
		return result;
	}

	public static void main(String[] args)
	{
		RandomListNode pHead = new RandomListNode(0);
		RandomListNode node1 = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);
		RandomListNode node3 = new RandomListNode(3);
		RandomListNode node4 = new RandomListNode(4);
		pHead.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		pHead.random = node4;
		node2.random = node1;
		node3.random = node2;
		node4.random = node3;

		RandomListNode copyList1 = Clone(pHead);
		while (copyList1 != null)
		{
			System.out.print(copyList1.label + " ");
			copyList1 = copyList1.next;
		}

		System.out.println();
		RandomListNode copyList2 = Clone(pHead);

		while (copyList2 != null)
		{
			if (copyList2.random != null)
			{
				System.out.print(copyList2.random.label + " ");
			}
			copyList2 = copyList2.next;
		}
	}
}

class RandomListNode
{
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label)
	{
		this.label = label;
	}
}
