package 剑指offer_7;

/** 
* @author Leon
* @date 创建时间：2018年3月5日 下午3:40:46
* @version 1.0
* 类说明 :
*  题目描述:
	请实现一个函数用来找出字符流中第一个只出现一次的字符。
	例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
*  输出描述:
	如果当前字符流没有存在出现一次的字符，返回#字符。
*/
public class Solution54
{
	/*
	 * 一个字符占8位，因此不会超过256个，可以申请一个256大小的数组来实现一个简易的哈希表
	 */
	int[] hashtable = new int[256];
	StringBuffer s = new StringBuffer();

	// Insert one char from stringstream
	public void Insert(char ch)
	{
		s.append(ch);
		hashtable[ch]++;
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce()
	{
		char[] str = s.toString().toCharArray();
		for (char c : str)
		{
			if (hashtable[c] == 1)
				return c;
		}
		return '#';
	}
}
