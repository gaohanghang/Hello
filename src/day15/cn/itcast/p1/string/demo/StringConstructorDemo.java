package day15.cn.itcast.p1.string.demo;

public class StringConstructorDemo {
    public static void main(String[] args) {


        stringConstructorDemo2();
    }

    private static void stringConstructorDemo2() {
        char[] arr={'w','a','p','q','x'};
        String s=new String(arr,1,3);
        System.out.println("s="+s);
    }

    private static void stringConstructorDemo() {
        String s=new String();//等效于String s="";不等效String s=null;

        byte[] arr={97,66,67,68};

        String s1=new String(arr);
        System.out.println("s1="+s1);
    }
}
