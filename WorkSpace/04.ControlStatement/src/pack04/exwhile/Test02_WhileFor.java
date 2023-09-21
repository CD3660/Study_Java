package pack04.exwhile;

public class Test02_WhileFor {
	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			int j=1;
			while (j<=9) {
				System.out.println(i + " x " + j + " = " + (i*j));
				j++;
			}
		}
	}
}
