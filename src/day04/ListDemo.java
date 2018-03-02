package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合，通常是有序集
 * @author Administrator
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list
		  =new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		String str=list.get(2);
		System.out.println(str);
		/*
		 * List集合可以通过下标遍历集合每个元素
		 */
		/*
		 * T set(int index,T t)
		 */
		System.out.println(list);
		String old=list.set(1, "2");
		System.out.println(list);
		System.out.println("被换的元素:"+old);
		
		// TODO Auto-generated method stub

	}
	
	
	
	

}
