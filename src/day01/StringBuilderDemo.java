package day01;
/**
 * StringBuilder用于解决字符串频繁修改带来的内存消耗
 * 所以将来我们有频繁修改字符串内容这样的操作时，首选使用StringBuilder
 * @author Administrator
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
	   StringBuilder builder=new StringBuilder("HelloWorld");
	   //内部默认为字符串：HelloWorld
	   //              0123  4567890123456
	   builder.append("努力学习java，为了找个好工作");
	   String str=builder.toString();
	   System.out.println(str);
	   //努力学习java，为了改变世界
	   builder.replace(10, 18, "为了改变世界");
	   String str1=builder.toString();
	   System.out.println(str1);
	   //为了改变世界
	   builder.delete(0, 10);
	   String str2=builder.toString();
	   System.out.println(str2);
	   
	   //活着，为了改变世界
	   builder.insert(0, "活着");	 
	   
	   String str3=builder.toString();
	   System.out.println(str3);
	   
	   /*
	    * System.out.println(
	    *   builder.append("努力学习java，为了找工作")
	    *   .replace(9,16,"为了改变世界")
	    *   .delete(0,8)
	    *   .insert(0,"活着")
	    *   .toString()
	    * );
	    */

	}

}
