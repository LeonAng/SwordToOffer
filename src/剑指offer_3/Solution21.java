package 剑指offer_3;

/** 
* @author Leon 
* @version 创建时间：2017年8月28日 下午4:44:58 
* 类说明 :
* 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
* 假设压入栈的所有数字均不相等。
* 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
* 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
*/
import java.util.Stack;

public class Solution21
{
	public static boolean IsPopOrder(int[] pushA, int[] popA)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;// popA的序号
		for (int i = 0; i < pushA.length; i++)
		{
			stack.push(pushA[i]);
			while (!stack.isEmpty() && stack.peek() == popA[index])
			{
				stack.pop();
				index++;
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		int[] pushA = new int[] { 1, 2, 3, 4, 5 };
		int[] popA = new int[] { 4, 5, 3, 2, 1 };
		int[] popB = new int[] { 4, 3, 5, 1, 2 };
		System.out.println(IsPopOrder(pushA, popA));
		System.out.println(IsPopOrder(pushA, popB));
	}
}
