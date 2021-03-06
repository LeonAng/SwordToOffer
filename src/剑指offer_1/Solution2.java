package 剑指offer_1;

/**
 * @author 12083
 *请实现一个函数，将一个字符串中的空格替换成“%20”。
 *例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution2
{
	public static String replaceSpace(StringBuffer str)
	{
		while (str.indexOf(" ") != -1)
		{
			int x = str.indexOf(" ");
			str.deleteCharAt(x);
			str.insert(x, "%20");
		}
		return str.toString();
	}

	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(str));
	}

}
