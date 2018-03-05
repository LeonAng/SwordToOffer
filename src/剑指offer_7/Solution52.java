package 剑指offer_7;

/** 
* @author Leon
* @date 创建时间：2017年11月11日 下午5:13:48
* @version 1.0
* 类说明 :
* 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
* 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
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
