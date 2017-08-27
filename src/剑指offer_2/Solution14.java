package 剑指offer_2;
/** 
* @author Leon 
* @version 创建时间：2017年8月27日 下午2:28:15 
* 类说明 :
* 输入一个链表，输出该链表中倒数第k个结点。
* 注释：倒数从倒数第一个开始，没有倒数第零个
*/
public class Solution14
{
	public static ListNode FindKthToTail(ListNode head,int k) 
	{
		if(head==null||k<=0)return null;
		
		int length=0;
		ListNode node = head;
		while(node!=null)
		{
			length++;
			node=node.next;
		}
		//System.out.println(length);
		if(length<k)return null;
		
		for(int i=0;i<=length-1-k;i++)
		{
			head = head.next;
		}
		return head;
    }
	
	public static void main(String[] args)
	{
		ListNode root = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		root.next=node1;
		node1.next=node2;
		node2.next=node3;
		if(FindKthToTail(root,0)!=null)
			System.out.println(FindKthToTail(root,0).val);
		else System.out.println("有问题。");
	}
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
