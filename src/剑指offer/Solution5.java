package 剑指offer;
/**
 * @author 12083
 *用两个栈来实现一个队列，完成队列的Push和Pop操作。 
 *队列中的元素为int类型
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
        
        /*重新写stack2*/
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
    	
    	/*重新写stack1*/
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
