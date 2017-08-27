package ��ָoffer_2;
/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��27�� ����2:28:15 
* ��˵�� :
* ����һ����������������е�����k����㡣
* ע�ͣ������ӵ�����һ����ʼ��û�е��������
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
		else System.out.println("�����⡣");
	}
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
