package day04;

import java.util.List;

/**
 * Comparable接口
 * @author Administrator
 *
 */
public class SortCollection2 {
	public static void main(String[] args) {
		List<Cell>list
		   =new ArrayList<Cell>();
		list.add(new Cell(4,5));
		list.add(new Cell(1,2));
		list.add(new Cell(1,5));
		list.add(new Cell(3,7));
		System.out.println(lis t);
		/*
		 * 使用Colletions的sort方法进行排序的集合，要求元素必须实现Comparable接口
		 * 只是实现该接口才认为是可比较的元素
		 */
		//Colletions.sort(list);//错误
	}

}
