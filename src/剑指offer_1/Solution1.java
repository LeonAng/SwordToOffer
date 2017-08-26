package 剑指offer_1;
/**
 * @author 12083
 *在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
	    
	    System.out.println("第一个数："+Find(target1,array));
	    System.out.println("第二个数："+Find(target2,array));
	}
}
