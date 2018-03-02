package day03;

import java.sql.Date;
import java.util.Calendar;

/**
 * Date与Calendar的转换
 * @author Administrator
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
	  //已有一个Date对象
		Date date=new Date(0);
		Calendar calendar=Calendar.getInstance();
		/*
		 * Calendar提供一个方法
		 * void setTime(Date date)
		 * 该方法用于使当前Calendar表示给定的Date所表示的时间
		 */
		calendar.setTime(date);
		

	}

}
