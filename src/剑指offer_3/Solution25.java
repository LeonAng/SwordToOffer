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
		return null;
	}

	public static void main(String[] args)
	{
		RandomListNode pHead = new RandomListNode(0);
		RandomListNode node1 = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);
		RandomListNode node3 = new RandomListNode(3);
		RandomListNode node4 = new RandomListNode(4);
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
