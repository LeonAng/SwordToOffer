package ��ָoffer_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
* @author Leon
* @date ����ʱ�䣺2018��3��5�� ����3:26:42
* @version 1.0
* ��˵�� :
* ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
* ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� 
* ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
* 
*/
public class Solution53
{
	public static void main(String[] args)
	{
		System.out.println(isNumeric(new char[] {'5','e','2'}));
	}

	public static boolean isNumeric(char[] str)
	{
		String s=String.valueOf(str);
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
	}
}
