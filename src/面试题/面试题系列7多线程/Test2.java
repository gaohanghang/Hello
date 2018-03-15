package 面试题.面试题系列7多线程;

/**
 * 单例模式
 *
 * 在多线程并发的前提下，单例模式还是单例吗?
 * 不是
 * --> synchronized
 */
public class Test2 {
    public static void main(String[] args) {
//        D d1 = new D();
//        System.out.println(d1);
//        D d2 = new D();
//        System.out.println(d2);

        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        t1.start();
        t2.start();
    }
}

class D{
    private D(){
        //throw new AssertionError();
    }

    private static D d = null;
    public synchronized static D getInstance(){
        if(d == null){
            d = new D();
        }
        return d;
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(D.getInstance());
    }
}