package exam.operator;

public class Ex01 {
	public static void main(String[] args) {
		int num1 = 2, num2 = 4;
		//num1과 num2의 사칙연산과 나머지를 구하기 ( 연산식으로 출력 )
		// num1과 num2의 더하기 결과 : 
		System.out.println("num1과 num2의 더하기 결과 : " +(num1+num2));
		System.out.println("num1과 num2의 빼기 결과 : " +(num1-num2));
		System.out.println("num1과 num2의 곱하기 결과 : " +(num1*num2));
		System.out.println("num1과 num2의 나누기 결과 : " +(num1/num2));
		System.out.println("num1과 num2의 나눈 나머지 결과 : " +(num1%num2));
		
		// num1을 마이너스로 반전시키고 출력하기, 출력 후에는 다시 양수로 반전시키기
		num1 = -num1;
		System.out.println(num1);
		num1 = -num1;
		// num1을 증감식을 이용하여 1 증가시키고, num2는 증감식을 이용하여 1 마이너스 시키기
		num1++;
		num2--;
		// 비교 연산지 3가지를 이용하여 두 변수를 비교하고 결과를 출력하기
		boolean boo1 = num1<num2;
		boolean boo2 = num1==num2;
		boolean boo3 = num1>num2;
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
				
		// 비교 연산자 1개를 사용하는데 AND 나 OR연산자를 이용하여 비교 연산자 1개를 더 연결시키고 결과 출력
		boolean boo4 = num1<num2 || 1>0;
		System.out.println(boo4);
		// 복합 대입 연산자 또는 변수의 현재 값에 1을 더하기 (num1, num2 모두 적용)
		num1 += 1;
		num2 *= 3;
		System.out.println(num1);
		System.out.println(num2);
		// 삼항 연산자 하나를 이용하여 비교하고 그 결과를 String형태로 받아서 결과 출력
		String str1 = num1<num2?"참":"거짓";
		System.out.println("num1<num2 은 " + str1);
		
	}
}
