package ��ָoffer;
/**
 * @author 12083
 *��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 *���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Solution2
{
	public static String replaceSpace(StringBuffer str) 
	{
		while(str.indexOf(" ")!=-1)
		{
			int x = str.indexOf(" ");
			str.deleteCharAt(x);
			str.insert(x, "%20");
		}
		return str.toString();
    }
	public static void main(String[] args)
	{
		StringBuffer str =new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(str));
	}

}
