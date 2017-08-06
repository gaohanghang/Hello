package day10;


class Outer6
{
    void method()
    {
        Object obj=new Object()
        {
            public void show()
            {
                System.out.println("show run");
            }
        };
//        obj.show();//因为匿名内部类这个子类对象被向上转型为了Object类型。
                    //这样就不能再使用子类特有方法了。
    }
}
public class InnerClassDemo6 {
    public static void main(String[] args) {
        new Outer6().method();
    }
}
