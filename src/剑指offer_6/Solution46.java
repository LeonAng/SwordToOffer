package 剑指offer_6;

/** 
* @author Leon
* @date 创建时间：2017年11月3日 下午4:27:58
* @version 1.0
* 类说明 :
* 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
* 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
* 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....
* 这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
* 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
*/
public class Solution46
{
	public static int LastRemaining_Solution(int n, int m)
	{
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
		{
			array[i] = 0;
		}

		int foo = 0;// 本次报数起始位置
		for (int i = 0; i < n - 1; i++)// 循环n-1次 每次将一个数赋值为1
		{
			for (int j = 0, k = foo; j < m;)// 报数
			{
				if (array[k] == 0)
				{
					if (j == m - 1)
					{
						array[k] = 1;
					}
					k++;
					j++;
					foo = k;
					if (foo == n)
					{
						foo = 0;
					}
				}
				else
				{
					k++;
				}
				if (k == n)
				{
					k = 0;
				}
			}

			// for (int w = 0; w < array.length; w++)
			// {
			// System.out.print(array[w] + " ");
			// }
			// System.out.println();

		}

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		System.out.println(LastRemaining_Solution(5, 3));
	}
}
