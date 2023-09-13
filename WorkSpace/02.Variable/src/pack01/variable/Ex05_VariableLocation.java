package pack01.variable;

public class Ex05_VariableLocation {
	public static void main(String[] args) {
		//블럭킹은 자바 프로로그램의 시작과 끝을 의미하기도 하지만 지역도 의미한다.
		//자바에서 지역은 매우 중요한 개념
		//클래스의 지역을 제외하고, 만들어진 모든 변수들은 지역변수라고 한다.
		//local variable
		int num = 10; //지역변수
		int num3 = 23;
		{//지역을 나눌 때 메모리를 차지한다. 지역1
			int num1 = 23;
			//int num1 = 23;이라고 새로 작성하면 변수명 중복으로 오류 발생
			num3 = num1 + 333;
		}//지역이 닫힐 때 메모리에서 사라진다.
		//int num3 = 356
		System.out.println(num3);
		{ //지역2
			int num1 = 23;//변수명이 겹치지만 지역이 다르기 때문에 오류가 발생하지 않으며
							// 이 구간을 처리할 때에는 위에서 선언된 num1에 대한 정보가 사라졌기 때문에 새로운 num1 변수를 선언할 수 있다.
			num3 = num3 + num1;
		
		}
		//num3 = 379
		System.out.println(num3);
		{ //지역3
			int num1 = 123;
			
		}
		
		System.out.println(num3);
	}
}
