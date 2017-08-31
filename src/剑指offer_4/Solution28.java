package ��ָoffer_4;

/** 
* @author Leon 
* @version ����ʱ�䣺2017��8��31�� ����11:45:55 
* ��˵�� :
* 	��Ŀ����
		����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
		���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
	��������:
		����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
*/
import java.util.*;

public class Solution28
{
	public static ArrayList<String> Permutation(String str)
	{
		ArrayList<String> result = new ArrayList<String>();

		if (str == null || str.length() == 0)
			return result;

		char[] letters = str.toCharArray();
		/* ð������ */
		for (int i = 0; i < letters.length; i++)
		{
			for (int j = i + 1; j < letters.length; j++)
			{
				if (letters[i] > letters[j])
				{
					char tmp = letters[i];
					letters[i] = letters[j];
					letters[j] = tmp;
				}
			}
		}

		TreeSet<String> temp = new TreeSet<>();
		sort(letters, 0, temp);
		result.addAll(temp);
		return result;
	}

	private static void sort(char[] chars, int begin, TreeSet<String> result)
	{
		if (chars == null || chars.length == 0 || begin < 0 || begin > chars.length - 1)
		{
			return;
		}

		if (begin == chars.length - 1)
		{
			result.add(String.valueOf(chars));
		} else
		{
			for (int i = begin; i <= chars.length - 1; i++)
			{
				swap(chars, begin, i);
				sort(chars, begin + 1, result);
				swap(chars, begin, i);
			}
		}
	}

	private static void swap(char[] x, int a, int b)
	{
		char t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

	public static void main(String[] args)
	{
		String str = "baC";

		ArrayList<String> list = Permutation(str);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
