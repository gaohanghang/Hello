package day10;

class Fu3
{
    Fu3()
    {
        System.out.println("fu contructor run");
        show();
    }
    void show()
    {
        System.out.println("hehe");
    }
}
class Zi3 extends Fu3
{
    int num=9;

    {
        System.out.println("constructor code..."+num);
        num=10;
    }
    Zi3()
    {
        super();
        //显示初始化
        //构造代码块初始化
        System.out.println("zi constructor..."+num);
    }
    void show()
    {

        System.out.println("show ..."+num);
    }

}
public class Test2 {
    public static void main(String[] args) {
        new Zi3();
    }
}
