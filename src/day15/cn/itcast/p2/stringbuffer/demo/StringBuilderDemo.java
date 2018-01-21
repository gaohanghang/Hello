package day15.cn.itcast.p2.stringbuffer.demo;

public class StringBuilderDemo {
    public static void main(String[] args) {

        /*
        jdk1.5 之后出现了功能和StringBuffer一模一样的对象。就是StringBuilder

        不同的是：
        StringBuffer是线程同步的。通常用于多线程。
        StringBuilder是线程不同步的。通常用于单线程。它的出现提高效率。

        jdk升级：
        1，简化书写。
        2，提高效率。
        3，增加安全性。
         */
    }
}
/*

class StringBuffer
{
    public  StringBuffer append(int x)
    {
        synchronized(lock)
        {
        }
    }

    public StringBuffer delete(int start,int end)
    {
        synchronized(lock)
        {
        }
    }
}
 */
