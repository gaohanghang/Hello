package day12;

/*
如何创建一个线程呢？
创建线程方式一：继承Thread类。

步骤：
1，定义一个类继承Thread类。
2，覆盖Thread类中的run方法。
3，直接创建Thread的子类对象创建线程。
4，调用start方法开启线程，并调用线程的任务run方法执行。


可以通过Thread的getName获取线程的名称 Thread-编号（从0开始）

主线程的名字就是main.
 */
class Demo3 extends Thread
{
    private String name;
    Demo3(String name)
    {
//        super(name);
        this.name=name;
    }

    public void run()
    {

        int[] arr=new int[3];
        System.out.println(arr[3]);
        for (int x=0;x<10;x++)
        {
//            for (int y = -99999999; y < 999999999; y++) {}
            System.out.println("....x="+x+".....name="+Thread.currentThread().getName());

        }
    }

}
class ThreaDemmo3 {
    public static void main(String[] args) {

        Demo3 d1=new Demo3("旺财");
        Demo3 d2=new Demo3("xiaoqiang");
        d1.start();//开启线程，调用run方法。

        d2.start();

        System.out.println(4/0);//throw new ArithmeticExcepption();  算数异常

        for (int x=0;x<20;x++)
        {
            System.out.println(x+"..."+Thread.currentThread().getName());
        }
    }
}

