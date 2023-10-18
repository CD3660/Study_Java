package exam.changetp3;

public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		if(child instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if(parent instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		parent = child;
		parent.method1();
		parent.method2();
		System.out.println("부모 클래스 = 자식 클래스 가능");
		child = (Child) parent;
		child.method1();
		child.method2();
		System.out.println("자식 클래스 = 부모 클래스 가능");
	}
}
