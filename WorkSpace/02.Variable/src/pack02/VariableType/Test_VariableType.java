package pack02.VariableType;

public class Test_VariableType {
	public static void main(String[] args) {
		byte byte_1 = 4;
		short short_1 = 124;
		char char_1 = 65;
		char char_2 = 'B';
		int int_1 = 13546;
		long long_1 = 13523442667L;
		boolean boolean_1 = true;
		String String_1 = "\"스트링\"";
		
		System.out.println(byte_1);
		System.out.println(short_1);
		System.out.println(char_1);
		System.out.println(char_2);
		System.out.println(int_1);
		System.out.println(long_1);
		System.out.println(boolean_1);
		System.out.println(String_1);
		
		{
			int int_2 = 545;
			System.out.println(int_2);
		}
	}
}
