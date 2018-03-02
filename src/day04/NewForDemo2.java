package day04;
/**
 * 新循环遍历数组
 * @author Administrator
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		String[] array={"1","2","3","4"};
		for(int i=0;i<array.length;i++){
			System.out.println("第"+i+"个元素是："+array[i]);
		}
		/*
		 * 新循环在遍历数组时，不会维护循环次数。
		 */
		for(String str:array){
			System.out.println(str);
		}

	}

}
