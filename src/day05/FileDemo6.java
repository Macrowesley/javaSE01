package day05;

import java.io.File;

public class FileDemo6 {
  public static void main(String[] args){
	 File dir=new File("a/b/c/d/e/f/g/h/i/j/k");
	 if(!dir.exists()){
		 dir.mkdirs();//mkdirs方法（mkdir加上s）在创建当前目录是，会自动创建所有不存在的父目录
		 System.out.println("创建目录成功");
	 }
    }
  }
