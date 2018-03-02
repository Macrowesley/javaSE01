package day01;
/**
 * 将当前字符串中的英文部分转换为全大写或全小写
 * String toUpperCace()
 * String toLowerCase()
 * @author Administrator
 *
 */
import java.util.Random;
import java.util.Scanner;
public class StringDemo8 {
	public static void main(String[] args) {
		String str="我爱Java";
		
		String upper=str.toUpperCase();
		System.out.println(upper);
		
		String lower=str.toLowerCase();
		System.out.println(lower);
		
//		String s="WA38yZde";
//		System.out.println("请输入验证码："+s);
//		Scanner scanner=new Scanner(System.in);
//		String input=scanner.nextLine();
//		s=s.toLowerCase();
//		input=input.toLowerCase();
//		if(s.equals(input)){
//			System.out.println("验证成功");
//		}else{
//			System.out.println("验证失败");
//		}
		Random random=new Random();
		String ran="";
		for(int i=0;i<5;i++){
			int num=random.nextInt(3);
			switch(num){
			case 0:
				char r=(char)(random.nextInt(26)+'a');
				ran+=r;
				break;
			case 1:
				char r1=(char)(random.nextInt(26)+'A');
				ran+=r1;
				break;
			case 2:
				ran+=random.nextInt(10);
				break;
			}
		}
		System.out.println(ran);
	}

}
