/*
�̰߳�ȫ������ԭ��
1������߳��ڲ�����������ݡ�
2�������������ݵ��̴߳����ж�����
��һ���߳���ִ�в����������ݵĶ�����������У������̲߳�������
�ͻᵼ���̰߳�ȫ����Ĳ�����
*/

class Ticket implements Runnable
{
	private int num=100;
	Object obj=new Object();
	
	public void run(){
		while(true){
			synchronized(obj) //ͬ�������
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