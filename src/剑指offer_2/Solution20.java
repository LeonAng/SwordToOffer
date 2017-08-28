package ��ָoffer_2;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��28�� ����4:16:06 
* ��˵�� :
* ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
*/
import java.util.Stack;

public class Solution20
{
	Stack<Integer> stack = new Stack<Integer>();

	public void push(int node)
	{
		stack.push(node);
	}

	public void pop()
	{
		stack.pop();
	}

	public int top()
	{
		return stack.peek();

	}

	public int min()
	{
		@SuppressWarnings("unchecked")
		Stack<Integer> stackTemp = (Stack<Integer>) stack.clone();
		int minNum = stackTemp.peek();
		while (!stackTemp.isEmpty())
		{
			int temp = stackTemp.pop();
			if (temp <= minNum)
			{
				minNum = temp;
			}
		}
		return minNum;
	}

	public static void main(String[] args)
	{

	}

}
