package ��ָoffer_1;
/**
 * @author 12083
 *��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 *�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Solution1
{
	public static boolean Find(int target, int [][] array)
	{
		int x=0;
		int y=0;
		while(x<=array.length-1)
		{
			while(y<=array[x].length-1)
			{
				if(array[x][y]==target)
				{
					return true;
				}
				else
				{
					y++;
				}
			}
			x++;
			y=0;
		}
		return false;
	}
	public static void main(String[] args)
	{
		int [][] array = new int [][]{{0,1,2,3,4,5,7,9,11,13},
			                          {4,6,8,12,15,16,17,18,20,21}};
	    int target1 = 1;
	    int target2 = 100;
	    
	    System.out.println("��һ������"+Find(target1,array));
	    System.out.println("�ڶ�������"+Find(target2,array));
	}
}
