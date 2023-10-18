package exam.testabstract;

public abstract class Animal {
	public String kind;
	
	//abstract 키워드가 들어간 메소드는 구현부를 넣으면 안됨
	public abstract void breathe();
	
	//음식을 먹는 메소드. 
	public abstract int eat(String food);
	
	public void method() {
		
	}
	
}
