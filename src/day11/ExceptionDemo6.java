package day11;

/*
异常的注意事项：

1，子类在覆盖父类方法时，父类的方法如果抛出了异常。
那么子类的方法只能抛出父类的异常或者该异常的子类。

2，如果父类抛出多个异常，那么子类只能抛出父类异常的子集。

简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集。

注意;如果父类的方法没有抛出异常，那么子类覆盖是绝对不能抛,就只能try.


 */
interface Inter
{
    void function();
}
class D implements Inter
{
    public void function()//throws Exception
    {

    }
}
class A extends Exception
{

}
class B extends A
{

}
class C extends Exception
{

}
//Exception
//    |--A
//        |--B
//    |--C

class Fu2
{
    void show()throws A
    {}
}
class Zi2 extends Fu2
{
    void show()throws B
    {

    }
}
class Test
{
    void method(Fu2 f)//Fu2 f=new Zi2();
    {
        try {
            f.show();
        }
        catch (A a)
        {

        }
    }

    public void show(Zi2 zi) {

    }
}
public class ExceptionDemo6
{
    public static void main(String[] args) {
        Test t=new Test();
        t.show(new Zi2());
    }

}
