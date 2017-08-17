package day14;


class Demo implements Runnable{
    public void run()
    {
        for (int x=0;x<50;x++)
        {
            System.out.println(Thread.currentThread().toString()+"...."+x);
            Thread.yield();
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        Demo d=new Demo();

        Thread t1=new Thread(d);
        Thread t2=new Thread(d);

        t1.start();



        t2.start();
//        t2.setPriority(Thread.MAX_PRIORITY);

//        try {
//            t1.join();   //t1线程要申请加入进来，运行。临时加入一个线程运算时可以使用join方法。
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (int x=0;x<50;x++)
        {
            System.out.println(Thread.currentThread()+"...."+x);
        }
    }
}
