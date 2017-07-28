package object;

/** TIJ4 Chapter Object, Exericise 1, page 89
 * Created by 高行行 on 2017/7/16.
 */

//Primitive 原始的
//创建一个类，它包含一个int域和一个char域，它们都没有被初始化
// 将它们的值打印出来，以验证Java执行了默认初始化
public class PrimitiveTest {
    static int i;
    static char c;

    public static void main(String[] args) {
        System.out.println("int = " + i);
        System.out.println("char = " + c);
    }


}
