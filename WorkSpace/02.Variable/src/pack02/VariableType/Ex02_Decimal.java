package pack02.VariableType;

public class Ex02_Decimal {
	public static void main(String[] args) {
		short short1;
		short1 = -12345;
		char char1;
		char1 = 55555;
		int int1;
		int1 = 217411100;
		long long1;
		long1 = 99999999999L;
		//long 변수는 int의 변종이기 때문에 int범위 내에서는 숫자 그대로 값 지정이 가능하다.
		//long 변수의 값이 int 범위 밖일 경우 L(대문자 권장)을 뒤에 붙여야 한다.
		//기본적으로 정수 리터럴을 int로 인식하기 때문에 L을 붙여서 long 변수임을 알려야 한다.
		System.out.println(short1);
		System.out.println(int1);
		System.out.println(long1);
		System.out.println(char1);
		//char 변수에 값을 지정하고 출력하면 char에 입력한 숫자에 해당하는 유니코드 상의 문자로 출력된다.
	}
}
