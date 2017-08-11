package day13;

/*
静态的同步函数使用的锁是 该函数所属字节码文件对象
可以用getClass方法获取，也可以用当前  类名.class表示。
 */
class Ticket3 implements Runnable {
    private static int num = 100;
    //    Object obj = new Object();
    boolean flag=true;
    public void run() {
//        System.out.println("this:"+this);

        if (flag)    //为真的时候走同步代码块
            while (true)
            {
                synchronized(Ticket3.class)//(this.getClass())
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
    public static synchronized void show(){
        if (num>0)
        {
            if (num > 0) {
                try { Thread.sleep(10); } catch (InterruptedException e) { }  //InterruptedException线程安全问题
                System.out.println(Thread.currentThread().getName() + "....Function...." + num--);
            }
        }
    }
}
public class StaticSynFunctionLockDemo {
    public static void main(String[] args) {
        Ticket3 t = new Ticket3();//创建一个线程任务对象。

//        Class clazz=t.getClass();
//
//        Class clazz2=Ticket3.class;
//        System.out.println("t:"+t);

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        try { Thread.sleep(10); } catch (InterruptedException e) { }
        t.flag=false;
        t2.start();
    }
}
