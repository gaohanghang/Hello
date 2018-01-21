package day12;

/*
死锁的场景之一：同步的嵌套。
 */
class Ticket implements Runnable{ //extends Thread{
    private int num = 400;
    Object obj = new Object();
    boolean flag = true;

    public void run()
    {
        if (flag)
            while (true)
            {
                synchronized(obj) //obj
                {
                    show(); //this锁
                }
            }
        else
            while (true)
                show();
    }

    public synchronized void show(){

        synchronized (obj){
            if(num>0){
                try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println(Thread.currentThread().getName()+"...function..."+num--);
            }
        }

    }
}



public class DeadLockDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();//创建一个线程任务对象。

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
