package day02;

/**
 * Created by 高行行 on 2017/7/18.
 */
public class OperateDemo {
    public static void main(String[] args) {
        //算数运算符。 + - * /  %(取余，模运算)
        //++(自增：就在原有数据基础上+,再赋给原有数据)

        // int x=6370;
        // x=x/1000*1000;
        //System.out.println(x);


        int a = 3,b;
        //a++;//a=a+1;
        b=a++;
        System.out.println("a=" + a+",b="+b);
    }
}
