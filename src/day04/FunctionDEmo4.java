package day04;

public class FunctionDEmo4 {
    public static void main(String[] args) {
//        int x=add(4,5);
//        System.out.println(x);
        printCFB();
    }
    /*
    函数的重载。
    1，同一个类。
    2，同名。
    3，参数个数不同，or参数类型不同。
    4,函数重载和返回值类型无关。
    5，java是严谨性语言，如果函数出现调用的不确实性，会编译失败。
     */

    //加法运算。两个整数的和。
    public static int add(int a,int b)
    {
        return a+b;
    }

    //加法运算，两个小数的和。
    public static double add(double a,double b)
    {
        return a+b;
    }

    //加法运算，三个整数的和。
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    /*
    打印乘法表。
     */
    public static void printCFB(int num)
    {
        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
    }
    /*
    打印标准乘法表
     */
    public static void printCFB() {
       printCFB(9);
    }


}
