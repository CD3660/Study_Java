package pack03.TypeChange;

public class Ex04_CastingFinish {
	public static void main(String[] args) {
		String str_v1 = "3.14";
		String str_v2 = "100";
		
		double double_v1 = Double.parseDouble(str_v1);
		System.out.println(double_v1 + 1);
		int int_v1 = Integer.parseInt(str_v2);
		System.out.println(int_v1+100);
		
		int int_v2 = (int)double_v1+1;
		short short_v1 = (short)(int_v1+100);
		
		System.out.println(int_v2);
		System.out.println(short_v1);
	}
}
