import java.util.concurrent.locks.*;

class Resource
{
  private String name;
  private int count=1;
  private boolean flag=false;

  Lock lock=new ReentrantLock();

  Condition con=lock.newCondition();

  public void set(String name)
  {
    lock.lock();
    try{
      while(flag)
      try{con.await();}catch(InterruptedException e){}

      this.name=name+count;
      count++;
      System.out.println(Thread.currentThread().getName()+"..producer.."+this.name);
      flag=true;
      //notifyAll();
      con.signalAll();
    }
    finally
    {
      lock.unlock();
    }
  }
  public void out()
  {
    lock.lock();
    try
    {
      while(!flag)
      try{con.await();}catch(InterruptedException e){}
      System.out.println(Thread.currentThread().getName()+".......Consumer......"+this.name);
      flag=false;
      con.signalAll();
    }
    finally
    {
      lock.unlock();
    }

  }
}
class Producer1 implements Runnable{
  private Resource r;
  Producer1(Resource r)
  {
    this.r=r;
  }
  public void run()
  {
    while(true)
    {
      r.set("apple");

    }
  }

}

class Consumer implements Runnable
{
  private Resource r;
  Consumer(Resource r)
  {
    this.r=r;
  }
  public void run()
  {
    while(true)
    {
      r.out();

    }
  }
}
class Producer{
  public static void main(String[] args)
  {
    Resource r=new Resource();
    Producer1 pro=new Producer1(r);
    Consumer con=new Consumer(r);

    Thread t0=new Thread(pro);
    Thread t1=new Thread(pro);
    Thread t2=new Thread(con);
    Thread t3=new Thread(con);
    t0.start();
    t1.start();
    t2.start();
    t3.start();
  }
}
