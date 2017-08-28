package 剑指offer_2;

/** 
* @author Leon 
* @version 创建时间：2017年8月28日 下午4:16:06 
* 类说明 :
* 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
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
