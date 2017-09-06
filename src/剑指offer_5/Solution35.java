package ��ָoffer_5;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��9��6�� ����1:13:49 
* ��˵�� :
* ��Ŀ����
* 	�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
* 	����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
* 
* ��������:
	��Ŀ��֤�����������û�е���ͬ������
	���ݷ�Χ��
		����%50������,size<=10^4
		����%75������,size<=10^5
		����%100������,size<=2*10^5
	ʾ��1
	����

	1,2,3,4,5,6,7,0
	���

	7
*/
public class Solution35
{
	public static int InversePairs(int[] array)
	{
		if (array == null || array.length == 0)
		{
			return 0;
		}

		int[] copy = array.clone();
		int count = InversePairsCore(array, copy, 0, array.length - 1);
		return count;
	}

	private static int InversePairsCore(int[] array, int[] copy, int low, int high)
	{
		/* �鲢����˼�� */
		if (low == high)
		{
			return 0;
		}
		
		int mid = (low + high) >> 1;
		int leftCount = InversePairsCore(array, copy, low, mid) % 1000000007;
		int rightCount = InversePairsCore(array, copy, mid + 1, high) % 1000000007;
		
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while (i >= low && j > mid)
		{
			if (array[i] > array[j])
			{
				count += j - mid;
				copy[locCopy--] = array[i--];
				
				if (count >= 1000000007)// ��ֵ��������
				{
					count %= 1000000007;
				}
			} else
			{
				copy[locCopy--] = array[j--];
			}
		}
		for (; i >= low; i--)
		{
			copy[locCopy--] = array[i];
		}
		for (; j > mid; j--)
		{
			copy[locCopy--] = array[j];
		}
		for (int s = low; s <= high; s++)
		{
			array[s] = copy[s];
		}
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args)
	{
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 0 };
		System.out.println(InversePairs(array));
	}
}
