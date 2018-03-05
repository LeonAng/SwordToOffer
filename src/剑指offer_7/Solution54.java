package ��ָoffer_7;

/** 
* @author Leon
* @date ����ʱ�䣺2018��3��5�� ����3:40:46
* @version 1.0
* ��˵�� :
*  ��Ŀ����:
	��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
	���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
*  �������:
	�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
*/
public class Solution54
{
	/*
	 * һ���ַ�ռ8λ����˲��ᳬ��256������������һ��256��С��������ʵ��һ�����׵Ĺ�ϣ��
	 */
	int[] hashtable = new int[256];
	StringBuffer s = new StringBuffer();

	// Insert one char from stringstream
	public void Insert(char ch)
	{
		s.append(ch);
		hashtable[ch]++;
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce()
	{
		char[] str = s.toString().toCharArray();
		for (char c : str)
		{
			if (hashtable[c] == 1)
				return c;
		}
		return '#';
	}
}
