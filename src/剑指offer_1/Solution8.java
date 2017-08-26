package 剑指offer_1;
/** 
* @author Leon 
* @version 创建时间：2017年8月26日 下午8:23:46 
* 类说明 :
* 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
* 求该青蛙跳上一个n级的台阶总共有多少种跳法。
* 分析：
*        1, (n=1)
*f(n) =  2, (n=2)
         f(n-1)+f(n-2) ,(n>2,n为整数)
*/
public class Solution8
{
	public static int JumpFloor(int target) 
	{
		if(target<=0)
		{
			return 0;
		}
		if(target==1)
		{
			return 1;
		}
		if(target==2)
		{
			return 2;
		}
		if(target==2)
		{
			return 2;
		}
		else
		{
			return JumpFloor(target-1)+JumpFloor(target-2);
		}
    }
	
	public static int JumpFloorBetter(int target) 
	{
        if(target <= 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int one = 1;
        int two = 2;
        int result = 0;
        for(int i = 2; i < target; i++)
        {
            result = one+ two;
            one = two;
            two = result;
        }
        return result;
    }
	
	public static void main(String[] args)
	{
		System.out.println(JumpFloor(4));
	}
}
