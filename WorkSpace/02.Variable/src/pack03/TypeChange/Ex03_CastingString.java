package pack03.TypeChange;

public class Ex03_CastingString {
	public static void main(String[] args) {
		String str1 = "10", str2 = "20";
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		
		System.out.println(int1 + int2);
		System.out.println(int1 +""+ int2);
		
		String str_1 = "10";
		String str_2 = "20";
		System.out.println(str_1+str_2);
		
		System.out.println(str_1 + (10 + 20));
		
		String numberString = 10 + "";
		
	}
}
