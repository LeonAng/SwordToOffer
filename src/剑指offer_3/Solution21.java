package ��ָoffer_3;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��28�� ����4:44:58 
* ��˵�� :
* ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
* ����ѹ��ջ���������־�����ȡ�
* ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
* ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
*/
import java.util.Stack;

public class Solution21
{
	public static boolean IsPopOrder(int[] pushA, int[] popA)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;// popA�����
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
