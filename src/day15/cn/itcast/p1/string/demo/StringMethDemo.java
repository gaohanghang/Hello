package day15.cn.itcast.p1.string.demo;


/**
 * 按照面向对象的思想对字符串进行功能分类。
 *"abcd"
 *
 * 1,获取；
 * 1.1 字符串中字符的个数（长度）。
 *      int length();
 * 1.2 根据位置获取字符。
 *      char charAt(int index);
 * 1.3 根据字符获取在字符串中的第一次出现的位置。
 *      int indexof(int ch)
 *      int index(int ch,int fromIndex); 从指定的位置进行ch的查找第一次出现的位置。
 *      根据字符串获取在字符串中的第一次出现的位置。
 *      int lastIndexOf(int ch)
 *      int lastIndexOf(int ch,int fromIndex);
 *      int lastIndexOf(String str);
 *      int lastIndexOf(String str,int fromIndex);
 * 1.4 获取字符串中的一部分字符串。也叫子串。
 *      String subString(int beginIndex,int endIndex)  //包含begin,不包含end.
 *      String substring(int beginIndex)
 *
 * 2,转换。
 *      2.1将字符串变成字符串数组（字符串的切割）
 *          String[]    sqlit(String regex);涉及到正则表达式。
 *      2.2 将字符串变成字符数组
 *          char[] toCharArrey();
 *      2.3 将字符串变成字节数组
 *          byte[] getBytes();
 *      2.4 将字符串中的字母转成大小写。
 *          String toUpperCase();大写
 *          String toLowerCase();小写
 *       2.5 将字符串中的内容进行替换
 *          String replace(char oldch,char newch);
 *          String replace(String s1,String s2)
 *       2.6 将字符串两端的空格去除。
 *          String trim();
 *       2.7将字符串进行连接。
 *          String concat(string);
 *
 *3,判断
 *      3.1 两个字符串内容是否相同啊？
 *          boolean equals(Object obj);
 *          boolean equalsIgnoreCase(String str);忽略大小写比较字符串内容。
 *
 *      3.2 字符串中是否包含指定字符串？
 *          boolean contains(String str);
 *
 *      3.3 字符串是否以指定字符串开头，是否以指定字符串开头，是否以指定字符串结尾。
 *          boolean startWith(string);
 *          boolean endwith(string);
 *
 * 4,比较
 *
 *
 *
 */
public class StringMethDemo {
    public static void main(String[] args) {
        stringMethodDemo_4();
    }

    private static void stringMethodDemo_4() {
        System.out.println("abc".compareTo("aqz"));
    }

    private static void stringMethodDemo_3() {
        String s="abc";
        System.out.println(s.equals("ABC".toLowerCase()));
        System.out.println(s.equalsIgnoreCase("ABC"));

        System.out.println(s.contains("cc"));

        String str = "ArrayDemo.java";
        System.out.println(str.startsWith("Array"));
        System.out.println(str.endsWith(".java"));
        System.out.println(str.contains("Demo"));

    }

    private static void stringMethodDemo_2() {
        String s="张三,李四,王五";
        String[] arr=s.split(",");

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        char[] chs=s.toCharArray();

        for (int i=0;i<chs.length;i++)
        {
            System.out.println(chs[i]);
        }
        s="ab你";
        byte[] bytes=s.getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("Abc".toUpperCase());

        String s1="java";
        String s2=s1.replace('a','z');
        System.out.println(s1==s2);//true

        System.out.println("-"+"     ab c    ".trim()+"-");

        System.out.println("abc".concat("kk"));
        System.out.println("abc"+"kk");
        System.out.println(String.valueOf(4)+1);
    }

    private static void stringMethodDemo_1() {
        String s="abcdae";

        System.out.println("length:"+s.length());//6
        System.out.println("char:"+s.charAt(2));//c   20 StringIndexOutOfBoundsException 字符串角标越界
        System.out.println("insex"+s.indexOf('k'));//0   //-1 我们可以根据-1，来判断该字符或字符串是否存在。
        System.out.println("index:"+s.lastIndexOf('a'));//4


        System.out.println("substring:"+s.substring(2,4));//cd
    }
}
