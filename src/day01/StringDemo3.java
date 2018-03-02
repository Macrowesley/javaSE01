package day01;
/**
 * indexof
 * 检索字符串位置
 * @author Administrator
 *
 */
public class StringDemo3 {
   public static void main(String[] args){
	   //          0123456789
	   String str="thinking in java";
	   int index=str.indexOf("in");
	   System.out.println("index:"+index);
	   /*
	    * indexOf(String str,int index)
	    * 查找给定字符串在当前字符串中的位置
	    * 首先第一个参数要在当前字符串中找到
	    * 然后返回第一个字母所在的下标位置
	    */
	   index=str.indexOf("in",3);//从第三个字符起找
	   System.out.println("index:"+index);
	   //返回给定字符串最后一次出现的位置
	   index=str.lastIndexOf("in");//字符串中最后出现in的位置
	   System.out.println("index:"+index);
	   
	   //email  @
	   String mail="1231@3123.com";
	   index=mail.indexOf("@");
	   if(index>0&&index<mail.length()-1){
		   System.out.println("是邮箱");
	   }else{
		   System.out.println("不是邮箱");
	   }
	   
	   
   }
}
