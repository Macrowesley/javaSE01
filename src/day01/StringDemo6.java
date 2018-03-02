package day01;
/**
 * 获取给定位置上的字符
 * char charAT(int index)
 * @author Administrator
 *
 */
public class StringDemo6 {
	public static void main(String[] args) {
       String str="上海自来水来自海上";
       char c=str.charAt(5);
       System.out.println(c);
       /*
        * 检查回文
        * 上海自来水来自海上
        * 思路：
        * 1.循环判断
        * 2.正数位置上的字符与倒数位置上的字符都一样
        */
       boolean tf=true;//开关
       for(int i=0;i<str.length()/2;i++){
    	   if(str.charAt(i)!=str.charAt(str.length()-1-i)){
    		   tf=false;
    		   break;
    	   }
       }
       if(tf){
    	   System.out.println("是回文");
       }else{
    	   System.out.println("不是回文");
       }
	}

}
