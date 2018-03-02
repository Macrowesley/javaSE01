package day04;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List<String>list
		   =new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		/*
		 * void add(int index,T t)
		 * 将给定的元素添加到给定的位置上
		 * 原位置以及后续的元素顺序向后移
		 * 插入操作
		 */
		System.out.println(list);
		list.add(1,"2");
		System.out.println(list);
		
	}
	

}
