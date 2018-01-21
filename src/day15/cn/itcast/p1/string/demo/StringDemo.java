package day15.cn.itcast.p1.string.demo;

/**
 * String类的特点：
 * 字符串对象一旦被初始化就不会改变。
 */
public class StringDemo {
    public static void main(String[] args) {
//        String s="abc";  //""字符串存储在常量池中。
////        s="nba";
//        String s1="abc";
//        System.out.println(s==s1); //true?
////        System.out.println("s="+s);

        stringDemo2();
    }
    public static void stringDemo2(){

        String s="abc";   //创建一个字符串对象在常量池中。
        String s1=new String("abc");//创建两个对象一个new一个字符串对象在堆内存中。

        System.out.println(s==s1);//false

        System.out.println(s.equals(s1));
        //string类中的equals复写Object中的equals建立了string类自己的判断字符串对象是否相同的依据
        //其实就是比较字符串内容。

//        System.out.println("s="+s);
//        System.out.println("s1="+s1);

    }

    /**
     * 演示字符串定义的第一种方式，并明确字符串处常量池的特点
     * 池中没有就建立，池中有，直接用。
     */
    private static void stringDemo1(){
        String s="abc"; //"abc"存储在字符串常量池中。
    }
}
