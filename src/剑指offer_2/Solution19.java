package 剑指offer_2;

/** 
* @author Leon 
* @version 创建时间：2017年8月28日 上午11:56:11 
* 类说明 :
* 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
* 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
* 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/
import java.util.ArrayList;

public class Solution19
{
	public static ArrayList<Integer> printMatrix(int[][] matrix)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (matrix == null)
			return null;

		int start = 0;
		while (matrix[0].length > start * 2 && matrix.length > start * 2)
		{
			printCircle(matrix, start, list);// 打印一圈
			start++;
		}
		return list;
	}

	private static void printCircle(int[][] array, int start, ArrayList<Integer> list)
	{
		int columns = array[0].length; // 列
		int rows = array.length; // 行
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		// 从左到右打印一行
		for (int i = start; i <= endX; i++)
		{
			int number = array[start][i];
			list.add(number);
		}
		// 从上到下打印一列
		if (start < endY)
		{
			for (int i = start + 1; i <= endY; i++)
			{
				int number = array[i][endX];
				list.add(number);
			}
		}
		// 从右到左打印一行
		if (start < endX && start < endY)
		{
			for (int i = endX - 1; i >= start; i--)
			{
				int number = array[endY][i];
				list.add(number);
			}
		}
		// 从下到上打印一列
		if (start < endX && start < endY - 1)
		{
			for (int i = endY - 1; i >= start + 1; i--)
			{
				int number = array[i][start];
				list.add(number);
			}
		}
	}

	public static void main(String[] args)
	{
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		ArrayList<Integer> list = printMatrix(matrix);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}
}
