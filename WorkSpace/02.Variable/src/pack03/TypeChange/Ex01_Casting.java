package pack03.TypeChange;

public class Ex01_Casting {
	public static void main(String[] args) {
		byte byte_v = 127;
		short short_v = byte_v;
		int int_v = short_v;
		long long_v = int_v;
		
		long long_v2 = 100;
		int int_v2 = (int)long_v2;
		System.out.println(long_v2);
		System.out.println(int_v2);
		
		double double_v2 = 3.14;
		int_v2 = (int)double_v2;
		System.out.println(double_v2);
		System.out.println(int_v2);
		
	}
}
