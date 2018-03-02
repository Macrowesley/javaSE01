package day03;
import java.util.Date;
/**
 * java.util.Date
 * 该类的每个实例用于表示一个时间
 * @author Administrator
 *
 */
public class DateDemo {
	public static void main(String[] args) {
	   /*
	    * 默认表示当前系统时间
	    */
		Date date=new Date();
	   System.out.println(date);
	   /*
	    * 获取该Date内部维护的long值
	    * 表示从1970-1-1 00：00：00到这一刻的毫秒值
	    */
	   long time=date.getTime();
	   System.out.println(time);
	   
	   date.setTime(0);
	   System.out.println(date);
	}
}
