/*
线程安全产生的原因：
1，多个线程在操作共享的数据。
2，操作共享数据的线程代码有多条。
当一个线程在执行操作共享数据的多条代码过程中，其他线程参与运算
就会导致线程安全问题的产生。
*/

class Ticket implements Runnable
{
	private int num=100;
	Object obj=new Object();
	
	public void run(){
		while(true){
			synchronized(obj) //同步代码块
			{
				if(num>0)
				{
					System.out.println(Thread.currentThread().getName()+"..sale.."+num--);
				}
			}
		}
	}
}
class TicketDemo
{
	public static void main(String[] args)
	{
		Ticket t=new Ticket();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}