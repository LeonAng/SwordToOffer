package 剑指offer_4;

/** 
* @author Leon 
* @version 创建时间：2017年8月31日 上午11:45:55 
* 类说明 :
* 	题目描述
		输入一个字符串,按字典序打印出该字符串中字符的所有排列。
		例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
	输入描述:
		输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
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
		/* 冒泡排序 */
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
