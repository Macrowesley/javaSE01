package day04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,Integer>map
		  =new HashMap<String,Integer>();
		map.put("数学",90);
		map.put("语文",98);
		map.put("物理",90);
		map.put("化学",98);
		Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		/*
		 * 遍历键值对
		 * Set<Entry> entrySet()
		 * 
		 */
		Set<Entry<String,Integer>> entrySet
		   =map.entrySet();
		for(Entry<String,Integer>e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
			
		}
		/*
		 * 遍历所有的value
		 */
		Collection<Integer>values
		             =map.values();
		for(Integer value:values){
			  System.out.println("value"+value);
		}
		

	}

}
