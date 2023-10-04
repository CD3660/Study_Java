package pack01.exceptioncode;

public class Ex01_NullPointer {
	public static void main(String[] args) {
		
		String[] a=null;
		if (a!=null) {
		System.out.println(a[0]);
		}
		System.out.println("여기");
	}
}
