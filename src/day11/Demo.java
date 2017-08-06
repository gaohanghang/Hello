package day11;


class Fu{
    int num=9;

    {
        System.out.println("Fu");//1 Fu
    }
    Fu()
    {
        super();//Object

        show();
    }
    void show(){
        System.out.println("fu show"+num);//被覆盖，运行子类的
    }

}
class Zi extends Fu{
    int num=8;

    {
        System.out.println("Zi");//3 Zi
    }
    Zi(){
        super();
        //显示初始化。
        //构造代码块初始化。
        show();
    }
    void show() {
        System.out.println("zi show"+num);//2 zi show 0  4 zo show 8
    }

}

public class Demo {
    public static void main(String[] args) {
        new Zi();
    }
}
/*
Fu
zi show0
Zi
zi show8
 */