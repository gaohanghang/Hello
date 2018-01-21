package day12;

/*
静态的同步函数使用的锁是 该函数所属的字节码文件对象 可以用 getClass方法获取，
也可以用当前 类名.class表示。
 */
//class Ticket implements Runnable{ //extends Thread{
//    private static int num = 100;
//    //    Object obj = new Object();
//    boolean flag = true;
//
//    public void run()
//    {
//        System.out.println("this:"+this.getClass());
//        if (flag)
//            while (true)
//            {
//                synchronized(Ticket.class)//(this.getClass())
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
//    public static synchronized void show(){
//        if(num>0){
//            try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
//            System.out.println(Thread.currentThread().getName()+"...function..."+num--);
//        }
//    }
//}

//public class StaticSynFunctionLockDemo {
//
//    public static void main(String[] args) {
//        Ticket t = new Ticket();//创建一个线程任务对象。
//
//        Class clazz = t.getClass();
//
////        Class clazz = Ticket.class;
////        System.out.println("t:"+t.getClass());
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
