package day14;


/*
停止线程：
1，stop方法。

2，run方法结束。

怎么控制线程的任务结束呢？
任务中都会有循环结构，只要控制住循环就可以结束任务。

控制循环通常就用定义标记来完成。

但是如果线程处于冻结状态，无法读取标记，如何结束呢？


 */
class StopThread implements Runnable
{
    private boolean flag = true;

    public void run()
    {

        while (flag)
        {
            try{
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName()+".....");
            }
        }
    }
    public void setFlag()
    {
        flag=false;
    }
}
public class StopThreadDemo
{
    public static void main(String[] args) {
        StopThread st=new StopThread();

        Thread t1=new Thread(st);
        Thread t2=new Thread(st);

        t1.start();
        t2.start();

        int num=1;
        for (;;)
        {
            if (++num==50)
            {
                st.setFlag();
                break;
            }
            System.out.println("main..."+num);
        }
        System.out.println("over");
    }
}
