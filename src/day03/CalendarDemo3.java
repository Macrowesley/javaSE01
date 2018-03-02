package day03;

import java.sql.Date;
import java.util.Calendar;

/**
 * 使用Calendar设置时间
 * @author Administrator
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar
		    =Calendar.getInstance();
		/*
		 * 
		 * 
		 */
		calendar.set(Calendar.YEAR, 2008);
		/*
		 * 月份的值可以使用常量
		 * 也可以直接给定值，需要注意：月份从0开始
		 * 即：0为1月份
		 */
	    calendar.set(Calendar.MONTH, 8);
	    calendar.set(Calendar.DAY_OF_MONTH, 30);
	    calendar.set(Calendar.HOUR_OF_DAY, 10);
	    calendar.set(Calendar.MINUTE,22);
	    calendar.set(Calendar.SECOND, 8);
	    Date date=calendar.getTime();
	    System.out.println(date);
	    

	}

}
