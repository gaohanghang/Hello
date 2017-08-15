package day14;


import com.sun.org.apache.regexp.internal.RE;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
生产者，消费者。

多生产者，多消费者
if判断标记，只有一次。会导致不该运行的线程运行了，出现了数据错误的情况。
while判断标记，解决了线程获取执行权后，是否要运行！

notify：只能唤醒一个线程，如果本方唤醒了本方，没有意义，而且while判断标记+notify会导致死锁。
notifyAll解决了，本方线程一定会唤醒对方线程的问题。

jdk1.5以后将同步和锁封装成了对象。
并将操作锁的隐式方法变成了显示动作。

Lock接口：出现替代了同步代码块或者同步函数，将同步的隐式操作变成现实锁操作。
同时更为灵活，可以一个锁上加上多组监视器。
lock():获取锁。
unlock():释放锁，通常需要定义finally代码块中。

Condition接口：出现替代了Object中的wait notify notifyAll方法。
             将这些监视器方法单独进行了封装，变成Condition监视器对象。
             可以任意锁进行组合。

await();
signal();
singleAll();
 */
class Resource2
{
    private String name;
    private int count=1;
    private boolean flag=false;

    //创建一个锁对象。
    Lock lock=new ReentrantLock();

    //通过已有的锁获取该锁上的监视器对象。
//    Condition con=lock.newCondition();

    //通过已有的锁获取两组监视器，一组监视生产者，一组监视消费者。
    Condition producer_con=lock.newCondition();
    Condition consumer_con=lock.newCondition();


    public  void set(String name) //t0  t1
    {
        lock.lock();
        try{
            while (flag)
                try {
//                    this.wait();
//                    con.await();
                    producer_con.await();
                } catch (InterruptedException e) {
                }
            this.name = name+count; //烤鸭1

            count++;

            System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);//生产烤鸭1
            flag=true;
//            notifyAll();
//            con.signalAll();
            consumer_con.signal();
        }
        finally {
            lock.unlock();
        }
    }

    public  void out()  //t2 t3
    {
        lock.lock();
        try{
            while(!flag)
                try {
//                    lock.wait();
//                    con.await();
                    consumer_con.await();
                } catch (InterruptedException e) {
                }
            System.out.println(Thread.currentThread().getName()+"...消费者......"+this.name);
            flag=false;
//            notifyAll();
//            con.signalAll();
            producer_con.notify();
        }
        finally {
            lock.unlock();
        }
    }
}
class Producer implements Runnable
{
    private Resource2 r;
    Producer(Resource2 r)
    {
        this.r=r;
    }
    public void run()
    {
        while (true)
        {
            r.set("烤鸭");
        }
    }
}
class Consumer implements Runnable
{
    private Resource2 r;
    Consumer(Resource2 r)
    {
        this.r=r;
    }
    public void run()
    {
        while (true)
        {
            r.out();
        }
    }
}
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Resource2 r=new Resource2();
        Producer pro=new Producer(r);
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
