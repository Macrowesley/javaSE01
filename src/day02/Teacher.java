package day02;
public class Teacher extends Person{
    private String name;
    private int age;
	private String gender;
	public void run(){
    	System.out.println("老师在跑");
    }
	public void teach(){}
	public static void main(String[] args) {
		Teacher p=new Teacher();
		p.name="苍老师";
		p.age=30;
		p.gender="男";
		String str=p.toString();
		System.out.println(str);
		
	}
	public String toString(){
		return name+","+age+","+gender;
	}
}