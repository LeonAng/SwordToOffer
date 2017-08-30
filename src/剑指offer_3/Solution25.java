package 剑指offer_3;

/** 
* @author Leon 
* @version 创建时间：2017年8月29日 下午2:51:20 
* 类说明 :
* 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
* 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
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
