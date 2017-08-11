package day13;


class Ticket4 implements Runnable {
    private static int num = 100;
    Object obj = new Object();
    boolean flag=true;
    public void run()
    {

        if (flag)    //为真的时候走同步代码块
            while (true)
            {
                synchronized(obj)
                {
                    show();
                }
            }
        else    //为假的时候走同步函数
            while (true)
                this.show();
    }
    public synchronized void show(){
        synchronized (obj)
        {
            if (num > 0) {
                try { Thread.sleep(10); } catch (InterruptedException e) { }  //InterruptedException线程安全问题
                System.out.println(Thread.currentThread().getName() + "....Function...." + num--);
            }
        }

    }
}
public class DeadLockDemo {
    public static void main(String[] args) {
        Ticket4 t=new Ticket4();

        Thread t1=new Thread(t);
        Thread t2=new Thread(t);

        t1.start();
        try { Thread.sleep(10); } catch (InterruptedException e) { }
        t.flag=false;
        t2.start();
    }
}
