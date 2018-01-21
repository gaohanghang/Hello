package day20e;

import java.util.Date;

public class DataDemo {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();
//        System.out.println(time);//1509173840038

        Date date = new Date();//将当前日期和时间封装成Date对象。
        System.out.println(date);//Sat Oct 28 14:58:33 CST 2017

        Date date2 = new Date(1509173840038L);//将指定毫秒值封装成Date对象。
        System.out.println(date2);

        /**
         * 日期对象和毫秒值之间的转换。
         *
         * 毫秒值-->日期对象：
         * 1，通过Date对象的构造方法 new Date(timeMillis);
         *
         * 日期对象
         */
    }

}
