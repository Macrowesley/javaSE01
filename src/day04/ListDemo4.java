package day04;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
	public static void main(String[] args) {
		List<Integer> list
		   =new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
			}
		System.out.println(list);
		/*
		 * List subList(int start,int end)
		 * 获取子集
		 */
		List<Integer> subList
		  =list.subList(3, 8);
		System.out.println(subList);
		/*
		 * 将子集中的元素扩大10倍
		 */
		for(int i=0;i<subList.size();i++){
			int num=subList.get(i);
			num=num*10;
			subList.set(i, num);
		}
		System.out.println(subList);
		/*
		 * 修改子集元素，会影响原集合
		 */
		System.out.println(list);
	}

}
