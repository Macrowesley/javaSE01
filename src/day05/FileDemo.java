package day05;

import java.io.File;

/**
 * java.io.File
 * @author Administrator
 *
 */
public class FileDemo {
	public static void main(String[] args){
		/*
		 * File.separator表示不同系统的目录层级分隔符
		 * 为了忽略平台差异性，我们在写路径时应当使用该常量
		 */
		File file=new File("."+File.separator+"demo.text");
		/*
		 * String getName()
		 * 获取File表示的文件或目录的名字
		 */
		String fileName=file.getName();
		System.out.println(fileName);
		
		boolean exists=file.exists();
		System.out.println("是否存在："+exists);
	}

}
