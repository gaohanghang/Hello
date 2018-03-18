package cn.itcast.p1.otherapi;

import java.util.Calendar;

/**
 * 08-其他对象API(Calendar类-基本演示)
 * 09-其他对象API(Calendar类-练习)
 *
 * showDays(year)  显示某一年2月有多少天
 * showDate(Calendar c) 显示当前日期
 * getWeek(int i) 显示当前星期几
 */
public class CalendarDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        int year = 2011;
        showDays(year);
    }

    /**
     * @param year
     */
    public static void showDays(int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);

        c.add(Calendar.DAY_OF_MONTH, -1);

        showDate(c);
    }

    public static void showDate(Calendar c) {
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MARCH)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+"年"+month+"月"+day+"日"+getWeek(week));
    }

    public static String getWeek(int i) {

        String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

        return weeks[i];
    }
}
