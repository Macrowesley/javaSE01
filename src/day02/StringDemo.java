package day02;
/**
 * String split(String regex)
 * 将当前字符串中满足正则表达式的部分拆分
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String str="boss,jack,marry,jackson";
		String[]array=str.split(",");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}

	}

}
