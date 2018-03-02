package day03;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 使用SimpleDateFormat
 * 将字符串转换为Date
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String str="2008-08-08 20:08:08";
		String dateFormat="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
		/*
		 * Date parse(String str)
		 * 将给定的字符串按照SimpleDateFormat指定
		 * 的日期格式解析并转换为Date对象返回
		 */
		Date date=(Date) sdf.parse(str);
		System.out.println(date);
	}

}
