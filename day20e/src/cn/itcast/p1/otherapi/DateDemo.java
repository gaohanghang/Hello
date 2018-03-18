package cn.itcast.p1.otherapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 04-其他对象API(Date类)
 * 05-其他对象API(Date类-日期对象转成字符串)
 * 06-其他对象API(Date类-字符串转成日期对象)
 * 07-其他对象API(Date类-练习)
 *
 */
public class DateDemo {

    /**
     * @param args
     */
    public static void main(String[] args) throws ParseException {

        methodDemo_3();

    }



    /**
     * 将日期格式的字符串-->日期对象。
     *  使用的是DateFormat类中的
     *  @throws
     */
    public static void methodDemo_3() throws ParseException {

        String str_date = "2012年4月19日";
        str_date = "2011---8---17";

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        dateFormat = new SimpleDateFormat("yyyy---MM---dd");

        Date date = dateFormat.parse(str_date);

        System.out.println(date);
    }

    /**
     * 对日期对象进行格式化。
     * 将日期对象-->日期格式的字符串
     * 使用的是DateFormat类中的format方法
     *
     */
    public static void methodDemo_2() {

        Date date = new Date();

        //获取日期格式对象，具有着默认的风格。FULL LONG等可以指定风格。
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.FULL);
//      System.out.println(dateFormat);

        //如果风格是自定义的如何解决呢？
        dateFormat = new SimpleDateFormat("yyyy--MM--dd");

        String str_date = dateFormat.format(date);

        System.out.println(str_date);
    }

    /**
     * 日期对象和毫秒值之间的转换。
     *
     * 毫秒值 --> 日期对象：
     *  1. 通过Date对象的构造方法 new Date(timeMillis)
     *  2. 还可以通过setTime设置。
     *
     *
     * 日期对象 --> 毫秒值
     *  2. getTime方法。
     * 因为可以通过具体的数值进行运算。
     */
    public static void methodDemo_1() {
        long time = System.currentTimeMillis();//
//      System.out.println(time);//1520589650261

        Date date = new Date();//将当前日期和时间封装成Date对象。
        System.out.println(date);//Fri Mar 09 18:00:50 CST 2018

        Date date2 = new Date(1520589650261l);//将指定毫秒值封装成Date对象。
        System.out.println(date2);
    }


}
