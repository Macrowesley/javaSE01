package day04;

public class SortCollection3 {
	public static void main(String[] args) {
		List<String>list
		   =
	}
}
/**
 * 何时声明比较器
 * 当集合中的元素已经实现了Comparable接口，并且实现了比较规则，但是该比较规则不能满足我们对于排序的需求时
 * 我们可以额外的定义一个比较规则
*/
class MyComparator
                implements Comparator<String>{
	/**
	 * 自定义比较字符串的规则，字符串字符多的大
	 */
	public int compare(String o1,String o2){
		return o1.length()-o2.length();
		}
}
