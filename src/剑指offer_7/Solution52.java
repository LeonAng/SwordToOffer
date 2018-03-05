package ��ָoffer_7;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��11�� ����5:13:48
* @version 1.0
* ��˵�� :
* ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
* �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
*/
import java.util.regex.*;
public class Solution52
{
	public static void main(String[] args)
	{
		char[] str = new char[] { 'a', 'a', 'a' };
		char[] pattern = new char[] { 'a', 'b', '*', 'a', 'c', '*', 'a' };
		
		System.out.println(match(str, pattern));
		
		boolean isMatch = Pattern.matches(String.valueOf(pattern), String.valueOf(str));
		System.out.println(isMatch);
	}

	public static boolean match(char[] str, char[] pattern)
	{
		
		return matchTwo(str, 0, str.length, pattern, 0, pattern.length);
	}

	private static boolean matchTwo(char[] str, int i, int length1, char[] pattern, int j, int length2)
	{
		if (i == length1 && j == length2)
		{
			return true;
		}
		if (i != length1 && j == length2)
		{
			return false;
		}

		if (i == length1 && j != length2)
		{
			while (j != length2)
			{
				if (pattern[j] != '*' && (j + 1 >= length2 || pattern[j + 1] != '*'))
				{
					return false;
				}
				j++;
			}
			return true;
		}
		if (j + 1 == length2)
		{
			if (str[i] == pattern[j] || pattern[j] == '.')
				return matchTwo(str, i + 1, length1, pattern, j + 1, length2);
			else
			{
				return false;
			}
		}
		if ((str[i] == pattern[j] || pattern[j] == '.') && pattern[j + 1] != '*')
			return matchTwo(str, i + 1, length1, pattern, j + 1, length2);
		if ((str[i] == pattern[j] || pattern[j] == '.') && pattern[j + 1] == '*')
			return matchTwo(str, i, length1, pattern, j + 2, length2)
					|| matchTwo(str, i + 1, length1, pattern, j, length2);
		if (pattern[j + 1] == '*')
			return matchTwo(str, i, length1, pattern, j + 2, length2);
		return false;
	}
}
