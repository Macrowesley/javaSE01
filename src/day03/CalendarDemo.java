package day03;

import java.sql.Date;
import java.util.Calendar;

/**
 * 日历类
 * 用于操作时间的类
 * @author Administrator
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 默认创建的Calendar表示当前系统时间
		 */
		Calendar calendar
		      =Calendar.getInstance();//获取一个实例
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * 该方法用于获取一个Date对象，该对象表示的时间就是当前Calendar表示的时间
		 */
		Date date=(Date) calendar.getTime();
        System.out.println(date);
	}

}
