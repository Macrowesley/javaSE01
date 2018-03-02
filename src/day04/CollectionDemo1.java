package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合批量处理
 * @author Administrator
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection conn1=new ArrayList();
		conn1.add("java");
		conn1.add(".net");
		System.out.println(conn1);
		
		Collection conn2=new ArrayList();
		conn2.add("android");
		conn2.add("iso");
		
		conn1.addAll(conn2);
		System.out.println(conn1);
	}

}
