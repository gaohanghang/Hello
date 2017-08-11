package day13;


/*
同步函数的使用的锁是this;

同步函数和同步代码块的区别：
同步函数的锁是固定的this.

同步代码块的锁是任意的对象。

建议使用同步代码块，

 */
class Ticket2 implements Runnable {
    private static int num = 100;
//    Object obj = new Object();
    boolean flag=true;
    public void run() {
//        System.out.println("this:"+this);

        if (flag)    //为真的时候走同步代码块
            while (true)
            {
                synchronized(this)
                {
                        if (num > 0)
                        {
                            try { Thread.sleep(10); } catch (InterruptedException e) { }  //InterruptedException线程安全问题
                            System.out.println(Thread.currentThread().getName() + "....obj...." + num--);
                        }
                }
            }
         else    //为假的时候走同步函数
             while (true)
                 show();

    }
    public  synchronized void show(){
        if (num>0)
        {
            if (num > 0) {
                try { Thread.sleep(10); } catch (InterruptedException e) { }  //InterruptedException线程安全问题
                System.out.println(Thread.currentThread().getName() + "....Function...." + num--);
            }
        }
    }
}

public class SynFunctionLockDemo {
    public static void main(String[] args) {

        Ticket2 t = new Ticket2();//创建一个线程任务对象。
//        System.out.println("t:"+t);

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        try { Thread.sleep(10); } catch (InterruptedException e) { }
        t.flag=false;
        t2.start();
    }
}
