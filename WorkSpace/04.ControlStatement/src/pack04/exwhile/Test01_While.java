package pack04.exwhile;

public class Test01_While {
	public static void main(String[] args) {
		int i=1;
		while (i<=9) {
			System.out.println("2 x " + i + " = " + (2*i));
			i++;
		}
		
		int j=2;
		while (j<=9) {
			int k = 1;
			while (k<=9) {
				System.out.println(j + " x " + k + " = " + (j*k));
				k++;
			}
			j++;
		}
	}
}
