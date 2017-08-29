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
