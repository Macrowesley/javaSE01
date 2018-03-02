package day02;
/**
 * 将字符串中满足正则表达式的部分替换为给定内容
 * @author Administrator
 *
 */
public class StringDemo4 {
	public static void main(String[] args) {
	  String str="adhb232jjn13jnjn3jnj334n";
	  str=str.replaceAll("\\d+","#num#");
	  System.out.println(str);

	}

}
