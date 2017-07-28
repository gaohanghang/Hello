package day03;

public class SwichDemo {
    public static void main(String[] args) {
        int x=3;//byte,short,int,char
        switch (x)
        {
            case 4:
                System.out.println("a");
                break;
            case 1:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;//挨着大括号的break
            default:
                System.out.println("d");
                break;
        }

        int a=4,b=2;
        char opr ='-';

        switch (opr)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("无法运算");
                break;
        }

    }


}
