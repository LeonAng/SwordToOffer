package ��ָoffer_2;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��28�� ����11:56:11 
* ��˵�� :
* ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
* ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
* �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
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
			printCircle(matrix, start, list);// ��ӡһȦ
			start++;
		}
		return list;
	}

	private static void printCircle(int[][] array, int start, ArrayList<Integer> list)
	{
		int columns = array[0].length; // ��
		int rows = array.length; // ��
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		// �����Ҵ�ӡһ��
		for (int i = start; i <= endX; i++)
		{
			int number = array[start][i];
			list.add(number);
		}
		// ���ϵ��´�ӡһ��
		if (start < endY)
		{
			for (int i = start + 1; i <= endY; i++)
			{
				int number = array[i][endX];
				list.add(number);
			}
		}
		// ���ҵ����ӡһ��
		if (start < endX && start < endY)
		{
			for (int i = endX - 1; i >= start; i--)
			{
				int number = array[endY][i];
				list.add(number);
			}
		}
		// ���µ��ϴ�ӡһ��
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
