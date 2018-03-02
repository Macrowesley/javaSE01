package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		
		for(String o:c){
			System.out.println(o);
		}
		Iterator<String> it=c.iterator();
		
		
	}

}
