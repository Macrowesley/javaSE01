package day04;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 数组转换为List集合
 * 不能转为不能存放重复元素的Set集合
 * @author Administrator
 *
 */
public class ToListDemo {
	public static void main(String[] args) {
		String[] array={"1","2"};
		/*
		 * 通过Arrays转换的集合是不能添加新元素的
		 */
          List<String> list
             =Arrays.asList(array);
          System.out.println(list);
          
          /*
           * 所有集合（包括Set集合）都支持一个
           * 构造方法，参数传入一个Collection
           * 这个构造方法的好处是，在创建当前集合时
           * 默认就包含给定集合中的所有元素
           */
          List<String> list2
             =new ArrayList<String>(list);
          
          System.out.println(list2);
         
          
	}

}
