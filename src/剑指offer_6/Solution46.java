package ��ָoffer_6;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����4:27:58
* @version 1.0
* ��˵�� :
* ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
* ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
* ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,����0...m-1����....
* ������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
* ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
*/
public class Solution46
{
	public static int LastRemaining_Solution(int n, int m)
	{
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
		{
			array[i] = 0;
		}

		int foo = 0;// ���α�����ʼλ��
		for (int i = 0; i < n - 1; i++)// ѭ��n-1�� ÿ�ν�һ������ֵΪ1
		{
			for (int j = 0, k = foo; j < m;)// ����
			{
				if (array[k] == 0)
				{
					if (j == m - 1)
					{
						array[k] = 1;
					}
					k++;
					j++;
					foo = k;
					if (foo == n)
					{
						foo = 0;
					}
				}
				else
				{
					k++;
				}
				if (k == n)
				{
					k = 0;
				}
			}

			// for (int w = 0; w < array.length; w++)
			// {
			// System.out.print(array[w] + " ");
			// }
			// System.out.println();

		}

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		System.out.println(LastRemaining_Solution(5, 3));
	}
}
