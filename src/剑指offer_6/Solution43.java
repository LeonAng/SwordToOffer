package ��ָoffer_6;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����3:26:48
* @version 1.0
* ��˵�� :
* �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
* ����һ���������ַ�����S���������ѭ������Kλ������������
* ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
* �ǲ��Ǻܼ򵥣�OK���㶨����
* 
*/
public class Solution43
{
	public static String LeftRotateString(String str, int n)
	{
		char[] foo = str.toCharArray();
		char[] result = new char[str.length()];

		int j = 0;
		for (int i = n; i < str.length(); i++)
		{
			result[j] = foo[i];
			j++;
		}
		for (int i = 0; j < str.length(); j++, i++)
		{
			result[j] = foo[i];
		}

		return String.valueOf(result);
	}

	public static void main(String[] args)
	{
		System.out.println(LeftRotateString("nice_to_meet_you_", 4));
	}

}
