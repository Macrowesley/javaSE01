package day04;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		/*
		 * 创建一个Map
		 * key是字符串，value是整数
		 */
		Map<String,Integer>map
		   =new HashMap<String,Integer>();
		/*
		 * V put(K k)
		 */
		
		map.put("数学",90);
		map.put("语文",90);
		map.put("英语",90);
		map.put("物理",90);
		map.put("化学",90);
		map.put("体育",90);
		System.out.println(map);
		Integer i=map.put("数学",100);
		System.out.println(map);
		System.out.println(i);//注意i的值
		/*
		 * V get(K k)
		 * 根据给定的key获取对应的value
		 */
		Integer num=map.get("英语");
		System.out.println("英语："+num);
		
		if(map.containsKey("数学")){
			System.out.println("包含数学");
		}else{
			System.out.println("");
		}
		
		 
		 

	}

}
