
public class Ex07_Oper {
	public static void main(String[] args) {
		int num1 = 10, num2 = 50;
		String str1 = num1 == 10 ? "10살입니다." : "10살이 아닙니다.";
		System.out.println(str1);
		
		int score = 70;
		String grade = score > 90 ? "A" : score > 80 ? "B" : score > 70 ? "C" : "D";
		System.out.println(grade);
	}
}
