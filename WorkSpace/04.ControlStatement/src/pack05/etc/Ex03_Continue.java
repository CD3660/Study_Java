package pack05.etc;

public class Ex03_Continue {
	public static void main(String[] args) {
		int oddSum = 0;
		for (int i=1;i<=10;i++) {
			if((i&1)!=1) {
				continue;
			}
			oddSum+=i;
		}
		System.out.println(oddSum);
		
	}
}
