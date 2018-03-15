package cn.itcast.p1.otherapi.system;

import java.util.Date;

public class DateDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        long time = System.currentTimeMillis();//
//      System.out.println(time);//1520589650261

        Date date = new Date();//将当前日期和时间封装成Date对象。
        System.out.println(date);//Fri Mar 09 18:00:50 CST 2018

        Date date2 = new Date(1520589650261l);//将指定毫秒值封装成Date对象。
        System.out.println(date2);

    }

    /**
     * 日期对象和毫秒值之间的转换。
     *
     * 毫秒值 --> 日期对象：
     *  1. 通过Date对象的构造方法 new Date(timeMillis)
     *  2. 还可以通过setTime设置。
     * 日期对象 --> 毫秒值
     *  2. getTime方法。
     * 因为可以通过具体的数值进行运算。
     */
}
