package pack01.method;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int a = 5;
		int b = 2;
		calc.plus(a, b);
		calc.minus(a, b);
		System.out.println(calc.mul(a, b));
		System.out.println(calc.div(a, b));
	}
}
