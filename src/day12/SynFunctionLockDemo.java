package day12;

/*
同步函数使用的锁是this;

同步函数和同步代码块的区别：
同步函数的锁是固定的this.

同步代码块的锁是任意的对象。

建议使用同步代码块。
因为同步函数的锁唯一的，只能是this

当同步代码块的锁是this时，可以简写成同步函数。
 */
//class Ticket implements Runnable{ //extends Thread{
//    private int num = 400;
////    Object obj = new Object();
//    boolean flag = true;
//
//    public void run()
//    {
//        System.out.println("this:"+this);
//        if (flag)
//            while (true)
//            {
//                synchronized(this)
//                {
//                    if(num>0){
//                        try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//                        System.out.println(Thread.currentThread().getName()+"...obj..."+num--);
//                    }
//                }
//            }
//        else
//            while (true)
//                show();
//    }
//
//    public synchronized void show(){
//        if(num>0){
//            try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//            System.out.println(Thread.currentThread().getName()+"...function..."+num--);
//        }
//    }
//}

//public class SynFunctionLockDemo {
//
//    public static void main(String[] args) {
//        Ticket t = new Ticket();//创建一个线程任务对象。
//        System.out.println("t:"+t);
//
//        Thread t1 = new Thread(t);
//        Thread t2 = new Thread(t);
//
//        t1.start();
//        try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//        t.flag = false;
//        t2.start();
//    }
//}
