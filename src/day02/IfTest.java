package day02;

public class IfTest {
    public static void main(String[] args) {
        /*
        根据用户指定的具体数据，判断该数据对应的星期。
        1-星期一Monday

        思路：
        因为数据不确定性，所以要对数据进行判断。
         */

        int week=10;

        if (week==1)
            System.out.println(week+"对应中文是星期一");
        else if (week==2)
            System.out.println(week+"对应中文是星期二");
        else if (week==3)
            System.out.println(week+"对应中文是星期三");
        else if (week==4)
            System.out.println(week+"对应中文是星期四");
        else if (week==5)
            System.out.println(week+"对应中文是星期五");
        else if (week==6)
            System.out.println(week+"对应中文是星期六");
        else if (week==7)
            System.out.println(week+"对应中文是星期日");
        else
            System.out.println(week+"没有对应的星期");

    }
}
