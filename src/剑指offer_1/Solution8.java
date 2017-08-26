package ��ָoffer_1;
/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��26�� ����8:23:46 
* ��˵�� :
* һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
* �����������һ��n����̨���ܹ��ж�����������
* ������
*        1, (n=1)
*f(n) =  2, (n=2)
         f(n-1)+f(n-2) ,(n>2,nΪ����)
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
