package homework01;
/*
 * 生成所有汉字
 */
public class Test06 {
	public static void main(String[] args) {
	   for(char c='\u4e00',i=0;c<='\u9fa5';c++,i++){
		   System.out.print(c);
		   if(i%50==0){
			   System.out.println();
		   }
	   }

	}

}
