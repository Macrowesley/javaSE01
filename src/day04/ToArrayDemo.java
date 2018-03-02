package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转数组
 * Collection中定义了两个方法
 * Object[] toArray()
 * <t>T[] toArray(T[] array)
 * @author Administrator
 *
 */
public class ToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c
		   =new ArrayList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		
		String[] array=c.toArray(new String[10]);
		
		for(String str:array){
			System.out.println(str);
		}

	}

}
