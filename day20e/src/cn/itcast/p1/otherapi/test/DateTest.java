package cn.itcast.p1.otherapi.test;

/*
    练习：
    "2012-3-17"到"2017-4-6"
    中间有多少天？
    思路：
    两个日期相减就哦了。
    咋减呢？
    必须要有两个可以进行减法运算的数。
    能减可以使毫秒值。如何获取毫秒值？通过date对象。
    如何获取date对象呢？可以将字符串转成date对象。

    1，将日期格式的字符串转成Date对象。
    2，将Date对象转成毫秒值。
    3，相减，再变成天数

 */
public class DateTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String str_date1 = "2012-3-17";
        String str_date2 = "2012-4-6";
        test(str_date1,str_date2);
    }

    private static void test(String str_date1,String str_date2) {

    }
}
