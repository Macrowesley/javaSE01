package day01;
/**
 * String subString(int start,int end)
 * 截取当前字符串的部分内容
 * @author Administrator
 *
 */
public class StringDemo4 {
	public static void main(String[] args) {
		//          0123456789
		String str="http://www.oracle.com";
	
		//String sub=str.substring(11,17);
		//System.out.println(sub);
		 
		int start=str.indexOf(".");
		int end=str.indexOf(".",start+1);
		String sub=str.substring(start+1,end);
		System.out.println(sub);
	}

}
