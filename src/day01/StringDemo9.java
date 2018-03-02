package day01;
/**
 * valueOf()
 * 若干重载方法
 * 作用：将基本类型转换为字符串
 * @author Administrator
 *
 */
public class StringDemo9 {
	public static void main(String[] args) {
		int i=100;
		double d=152.365;		
		String is=String.valueOf(i);
		String ds=String.valueOf(d);
		String str=is+ds;//String str=100+"";
		System.out.println(str);
	}
}