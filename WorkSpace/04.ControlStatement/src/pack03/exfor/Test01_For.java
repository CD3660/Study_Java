package pack03.exfor;

public class Test01_For {
	public static void main(String[] args) {
		int sumOdd=0, sumEven=0, sum=0;
		for (int i=1; i<=9; i++) {
			sum+=i;
			if (i%2==0) {
				sumEven+=i;
			} else {
				sumOdd+=i;
			}
		}
		System.out.println("홀수의 합 : "+sumOdd);
		System.out.println("짝수의 합 : "+sumEven);
		System.out.println("합 : "+sum);
	}
}
