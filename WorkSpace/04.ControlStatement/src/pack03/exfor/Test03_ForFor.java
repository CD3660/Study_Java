package pack03.exfor;

public class Test03_ForFor {
	public static void main(String[] args) {

		for (int i=1; i<=100; i++) {
			for (int j=1; j<=100;j++) {
				if (4*i+5*j==600) {
					System.out.println("("+ i + "," + j + ")");
				}
			}
		}
		
}
}
