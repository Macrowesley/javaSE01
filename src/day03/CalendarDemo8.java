package day03;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 输入一个日期，输出3年，3个月，3天后的当周的周三的日期
 * @author Administrator
 *
 */
public class CalendarDemo8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个日期：（格式）");
		String dateStr=scanner.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateStr);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR,3);
		calendar.add(Calendar.MONTH,3);
		calendar.add(Calendar.DAY_OF_YEAR,3);
		calendar.add(Calendar.DAY_OF_WEEK,4);
		date=calendar.getTime();
		dateStr=sdf.format(date);
		System.out.println(dateStr);
		

	}

}
