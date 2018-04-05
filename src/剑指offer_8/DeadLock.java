package 剑指offer_8;

/** 
* @author Leon
* @date 创建时间：2018年3月6日 下午4:43:38
* @version 1.0
* 类说明 :
* 
*/

public class DeadLock implements Runnable
{
	public int flag = 1;
	public static Object o1 = new Object();
	public static Object o2 = new Object();

	public void run()
	{
		System.out.println("flag=" + flag);
		if (flag == 1)
		{
			synchronized (o1)
			{
				try
				{
					Thread.sleep(500);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				synchronized (o2)
				{
					System.out.println("1");
				}
			}

		}
		if (flag == 0)
		{
			synchronized (o2)
			{
				try
				{
					Thread.sleep(500);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				synchronized (o1)
				{
					System.out.println("0");
				}
			}
		}
	}

	public static void main(String[] args)
	{
		DeadLock td1 = new DeadLock();
		DeadLock td2 = new DeadLock();
		td1.flag = 1;
		td2.flag = 0;

		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);

		t1.start();
		t2.start();
	}
}
