package Pack02.exarray1;

public class Test01_Array {
	public static void main(String[] args) {
		int[] intArr = new int[10];

		for (int i = 0 ; i<10; i++) {
			intArr[i]=i+1;
			System.out.println(intArr[i]);
		}
		double sum = 0;
		for (int i=0; i<10; i++) {
			sum+= intArr[i];
		}
		System.out.println(sum/10);
	}
}
