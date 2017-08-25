package ��ָoffer;
/**
 * @author 12083
 *������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ 
 *�����е�Ԫ��Ϊint����
 */
import java.util.Stack;
public class Solution5
{
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) 
    {
        stack1.push(node);
        stack2.clear();
        
        /*����дstack2*/
        int size=stack1.size();
		@SuppressWarnings("unchecked")
		Stack<Integer> stackTemp = (Stack<Integer>) stack1.clone();
        for(int i=0;i<size;i++)
        {
        	stack2.push(stackTemp.pop());
        }
    }
    
    public int pop() 
    {
    	int result = stack2.pop();
    	stack1.clear();
    	
    	/*����дstack1*/
        int size=stack2.size();
		@SuppressWarnings("unchecked")
		Stack<Integer> stackTemp = (Stack<Integer>) stack2.clone();
        for(int i=0;i<size;i++)
        {
        	stack1.push(stackTemp.pop());
        }
		return result;
    }
    
    public static void main(String[] args)
	{
		Solution5 x =new Solution5();
		x.push(1);
		x.push(2);
		x.push(3);
		x.push(4);
		x.push(5);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(x.pop());
		}
	}
}
