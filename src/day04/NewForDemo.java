package day04;

import java.util.ArrayList;
import java.util.Collection;

public class NewForDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		/*
		 * 新循环并非新的语法，只是编译器在编译成class文件时，将新循环转换为
		 * 迭代器，所以，在新循环遍历集合时，不能通过集合的方法改变集合元素
		 * 
		 */
		for(Object o:c){
			String str=(String)o;
		}
		System.out.println(c);
	}

}
