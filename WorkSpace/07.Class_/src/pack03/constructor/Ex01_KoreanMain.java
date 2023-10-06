package pack03.constructor;

public class Ex01_KoreanMain {
	public static void main(String[] args) {
		Ex01_Korean ko1 = new Ex01_Korean("123456-1234567","박찬영");
		

		System.out.println(ko1.nation);
		System.out.println(ko1.name + ko1.ssn);
		
		String ssn ="123456-1233445";
		Ex01_Korean ko2 = new Ex01_Korean(ssn, "김민주");

		System.out.println(ko2.ssn);
		
	}
}
