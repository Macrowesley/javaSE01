package day04;

public class TypeDemo<T> {//泛型
	private T x;
	public TypeDemo(T x){
		this.x=x;
	}
	public T getX(){
		return x;
	}
	public void setX(T x){
		this.x=x;
	}
    public String toString(){
    	return x+"";
    }

	

}
