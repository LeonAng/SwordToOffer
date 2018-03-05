package 剑指offer_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
* @author Leon
* @date 创建时间：2018年3月5日 下午3:26:42
* @version 1.0
* 类说明 :
* 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
* 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
* 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
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
