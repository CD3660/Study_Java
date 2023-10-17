package exam.testextends;

public class ExtendMain {
	public static void main(String[] args) {
		Parent_Class parent = new Parent_Class();
		System.out.println(parent.parent_field1);
		System.out.println(parent.parent_field2);
		
		parent.parentMethod();
		
		Child_Class child = new Child_Class();
		System.out.println(child.child_field);
		System.out.println(child.parent_field1);
		System.out.println(child.parent_field2);
	}
}
