package exam.testextends;


public class Parent_Class {
	
	public String parent_field1 = "PUBLIC 출력";
	String parent_field2="DEFAULT";
	private String parent_field3="PRIVATE";
	
	public void parentMethod() {
		System.out.println("부모 클래스의 인스턴스 멤버");
	}
}
