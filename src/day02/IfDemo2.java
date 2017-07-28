package day02;

public class IfDemo2 {
    public static void main(String[] args) {

        {//局部代码块可以定义局部变量的生命周期
            int a = 3;
            //a的运算
            System.out.println(a + 4);
        }


        int x=3;
        if (x>1)
            System.out.println("a");
        else if (x>2)
            System.out.println("b");
        else if (x>3)
            System.out.println("c");
        else
            System.out.println("d");

        int y=3;
        if (y>1)
            System.out.println("a");
        if (y>2)
            System.out.println("b");
        if (y>3)
            System.out.println("c");
        else
            System.out.println("d");


        if(x==1){
            if (y==1)
            {
                System.out.println("a");
            }
            else
            {
                System.out.println("b");
            }
        }
        else
        {
            if (y==1)
            {
                System.out.println("c");
            }
            else
            {
                System.out.println("d");
            }
        }


        {//局部代码块
            int m=89;
            System.out.println("Hello World..."+m);
        }

    }
}
