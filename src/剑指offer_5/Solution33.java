package ��ָoffer_5;

import java.util.ArrayList;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��9��5�� ����5:01:34 
* ��˵�� :
* ��ֻ��������2��3��5��������������Ugly Number����
* ����6��8���ǳ�������14���ǣ���Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ��������
* �󰴴�С�����˳��ĵ�N��������
*/
public class Solution33
{
	public static int GetUglyNumber_Solution(int index)
	{
		if (index <= 0)
			return 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i2 = 0, i3 = 0, i5 = 0;
		/**
		 * �����˼���ǣ�ÿһ�������ض�����֮ǰ��ĳ��������2��3��5�ĳ˻��õ��ģ�
		 * ������һ����������֮ǰ�ĳ����ֱ����2��3��5��
		 * �ҳ�������������С�Ķ��Ҵ��ڵ�ǰ��������ֵ����Ϊ��һ��Ҫ��ĳ�����
		 * 
		 * ���ǰ�֮ǰÿһ���������ֱ����2��3��5Ȼ����бȽϲ��Ǳ���ġ�
		 * ���Լ�¼ĳ������λ�ã��ڸ���֮ǰ�ĳ�������2��3��5���϶���С�ڵ�ǰ�������ġ�
		 * */
		while (list.size() < index)
		{
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return list.get(list.size() - 1);
	}

	public static void main(String[] args)
	{
		System.out.println(GetUglyNumber_Solution(6));
	}
}
