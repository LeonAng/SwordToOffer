package ��ָoffer_6;

/** 
* @author Leon
* @date ����ʱ�䣺2017��11��3�� ����3:39:07
* @version 1.0
* ��˵�� :
* ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
* ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����
* Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
*/
public class Solution44
{
	public static String ReverseSentence(String str)
	{
		if (str == null)
		{
			return null;
		}
		if (str.trim().equals(""))
		{
			return str;
		}

		String string = str;
		String[] strings = string.split(" ");
		StringBuffer sBuilder = new StringBuffer();
		for (int i = strings.length - 1; i >= 0; i--)
		{
			if (i == 0)
			{
				sBuilder.append(strings[i]);
			}
			else
			{
				sBuilder.append(strings[i]);
				sBuilder.append(" ");
			}
		}

		String string2 = sBuilder.toString();
		return string2;
	}

	public static void main(String[] args)
	{
		System.out.println(ReverseSentence("student. a am I"));
	}

}
