package day15.cn.itcast.p1.string.test;

/*
4.模拟一个trim功能一致的方法,去除字符串两端的空白
思路：
1.定义两个变量。
    一个作为从头开始判断字符空格的角标。
    一个变量作为从尾开始判断字符空格的角标。不断++
2.判断到不是空格为止,取头尾之间的字符串即可。不断--
 */
public class StringTest_4 {
    public static void main(String[] args) {

        String s = "   ab     c     ";

        System.out.println("-" + s + "-");

        s = myTrim(s);
        System.out.println("-" + s + "-");
    }

    private static String myTrim(String s) {
        int start = 0, end = s.length()-1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (start <= end && s.charAt(end) == ' ') {
            end--;
        }
        return s.substring(start,end + 1);
    }
}
