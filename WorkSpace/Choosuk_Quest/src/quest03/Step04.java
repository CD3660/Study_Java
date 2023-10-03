package quest03;

public class Step04 {
	public static void main(String[] args) {
		int[] intArr1 = { 3, -1, 2, 4 };
		int[] intArr2 = { 2, 1, -3, 2 };
		int[] arrAPlusB = new int[4];
		for (int i = 0; i < intArr1.length; i++) {
			arrAPlusB[i] = intArr1[i] + intArr2[i];
			System.out.print(arrAPlusB[i] + " ");
		}

	}
}
