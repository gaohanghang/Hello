package day10;

class Fu2
{
    Fu2()
    {
        show();
    }
    void show()
    {
        System.out.println("hehe");
    }
}
class Zi2 extends Fu2
{
    int num=9;
    Zi2()
    {
        super();
        //显示初始化。
        System.out.println("zi constructor..."+num);
    }
    void show()
    {
        System.out.println("show ..."+num);
    }
}

public class Test {
    public static void main(String[] args) {
        new Zi2();
    }
}
