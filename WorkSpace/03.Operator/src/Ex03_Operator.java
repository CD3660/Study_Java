
public class Ex03_Operator {
	public static void main(String[] args) {
		int num1 = 1, num2 = 1;
		num1++;
		num2++;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1++); 
		System.out.println(++num2); 
		
		System.out.println("증감식 종료 후 num1 : " + num1);
		System.out.println("증감식 종료 후 num2 : " + num2);
	}
}
