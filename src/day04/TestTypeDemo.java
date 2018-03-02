package day04;

public class TestTypeDemo {
	public static void main(String[] args) {
		TypeDemo<String> t
		  =new TypeDemo<String>("");
		
		String s=t.getX();
		
		TypeDemo<Integer>tt
		    =new TypeDemo<Integer>(1);
		int i=tt.getX();
	}

}
