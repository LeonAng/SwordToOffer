package ��ָoffer_2;
/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��27�� ����5:24:26 
* ��˵�� :
* ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
*/
public class Solution16
{
	public static ListNode Merge(ListNode list1,ListNode list2) 
	{
		if(list1==null)
		{
            return list2;
        }
		else if(list2==null)
        {
            return list1;
        }
		
        ListNode node = null;
        if(list1.val<list2.val)
        {
            node = list1;
            node.next = Merge(list1.next,list2);
        }
        else
        {
            node = list2;
            node.next = Merge(list1,list2.next);
        }
        return node;
    }
	
	public static void main(String[] args)
	{
		ListNode list1 = new ListNode(0);
		ListNode list1_1 = new ListNode(1);
		ListNode list1_2 = new ListNode(2);
		ListNode list1_3 = new ListNode(3);
		list1.next=list1_1;
		list1_1.next=list1_2;
		list1_2.next=list1_3;
		
		ListNode list2 = new ListNode(1);
		ListNode list2_1 = new ListNode(3);
		ListNode list2_2 = new ListNode(6);
		ListNode list2_3 = new ListNode(7);
		list2.next=list2_1;
		list2_1.next=list2_2;
		list2_2.next=list2_3;
		
		ListNode root = Merge(list1,list2);
		while(root!=null)
		{
			System.out.print(root.val+"	");
			root=root.next;
		}
	}
}

/*
public class ListNode 
{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/