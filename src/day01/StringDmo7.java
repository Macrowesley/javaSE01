package day01;
/**
 * 判断当前字符串是否是以给定的字符串开头或结尾的
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * @author Administrator
 *
 */
public class StringDmo7 {
	public static void main(String[] args) {
	  String str="Thinking In Java";
	  boolean starts=str.startsWith("Thi");
	  if(starts){
		  System.out.println("开头");
	  }else{
		  System.out.println("不是开头");
	  }
	  
	}

}

