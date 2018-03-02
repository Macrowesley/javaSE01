package day01;
/**
 * 字符串反转
 * @author Administrator
 *
 */
public class StringBuilderDemo2 {
	public static void main(String[] args) {
		StringBuilder builder
		    =new StringBuilder("HelloWorld");
        builder.reverse();
        String str=builder.toString();
        System.out.println(str);
	}
}