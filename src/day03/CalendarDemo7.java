package day03;

import java.util.Calendar;

public class CalendarDemo7 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * 获取当月总共多少天
		 */
		int days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);

	}

}
