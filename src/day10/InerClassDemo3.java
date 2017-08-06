package day10;


/*
内部类可以存储在局部位置上.
内部类在局部位置上只能访问局部中被fianl修饰的局部变量。

 */

class Outer3
{
    int num=3;
    Object method()
    {
        final int x=9;
        class Inner
        {
            void show()
            {
                System.out.println("show ..."+x);
            }
        }
        Object in=new Inner();
        return in;//0x0045
//        in.show();
    }
}
public class InerClassDemo3 {
    public static void main(String[] args) {
        Outer3 out=new Outer3();
        Object obj=out.method();
    }
}


