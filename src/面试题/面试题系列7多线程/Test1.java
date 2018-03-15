package 面试题.面试题系列7多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程
 * 汇总：
 * 1.什么是线程?什么是进程?
 *
 * 操作系统 --> 进程 --> 基于内存
 * 进程 --> 线程
 *
 * 2.如何创建一个线程?Java中多线程有几种实现方式?
 *
 *      1.继承Thread类
 *      2.实现Runnable接口
 *      3.实现Callable接口
 *
 * 3.线程的生命周期?
 * new Thread --> .start() --> Runable --> .run() --> Running
 *
 * stop() --> Dead
 *
 * wait() / sleep() / 网络中断 /IO异常 --> Block
 *
 * Running --> yield() --Runable
 *
 * 4.run()和start()有什么区别?
 * .start() --> 不调用CPU
 * .run() --> 调用CPU
 *
 * 5.stop()、sleep()、yield()、wait()有什么区别? wait pool --> notify()
 *
 *
 * 6.什么是线程池?
 *
 * 池 --> Java创建线程和销毁对象都是要用资源的，--> 连接池、线程池...
 *
 * 线程池 JDK1.5
 *
 * 7.什么是线程的同步和异步?
 *
 * 8.synchronized关键字的用法?
 *
 * 9.synchronized和lock的区别? jdk1.5 / 性能好，更面向对象
 *
 */
public class Test1 {
    public static void main(String[] args) {
//        A a = new A();
//        Thread thread = new Thread(a); //创建线程
//        thread.start();
//
//        /**
//         * main 方法也是一个线程，通常称之为:"主线程"
//         * 线程优先级 /时间轮换
//         *
//         */
//        for (;;){
//            System.out.println("world");
//        }

        B b = new B();
        Thread thread = new Thread(b);
        thread.start();
        //Thread.sleep(millis);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (;;){
//                    System.out.println("i");
//                }
//            }
//        }).start();

        //JDK1.5之后 --> 引入了线程池
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        executorService.submit(new C());
    }
}

/**
 * 方式一：继承Thread类
 */
class A extends Thread{
    @Override
    public void run() {
        for (;;){
            System.out.println("hello");
        }
    }
}

/**
 * 方式二：实现Runnable接口
 */
class  B implements Runnable{
    @Override
    public void run() {
        for (;;){
            System.out.println("i");
        }
    }
}

/**
 * 方式三：实现Callable接口
 */
class C implements Callable{
    @Override
    public Object call() throws Exception {
        for (;;){
            System.out.println("2");
        }
    }

}