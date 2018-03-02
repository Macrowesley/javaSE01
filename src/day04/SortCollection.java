package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合排序
 * @author Administrator
 *
 */
public class SortCollection {
	public static void main(String[] args) {
		List<Integer> c
		   =new ArrayList<Integer>();
		Random random=new Random();
		for(int i=0;i<10;i++){
			c.add(random.nextInt(100));//10个随机数放到集合
		}
		System.out.println(c);
		/*
		 * 通过Collections这个集合的工具类
		 * 可对List集合进行自然排序
		 */
		Collections.sort(c);//排序
		System.out.println(c);
	}

}
