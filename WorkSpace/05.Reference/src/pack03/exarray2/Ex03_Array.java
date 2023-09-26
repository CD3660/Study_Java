package pack03.exarray2;

public class Ex03_Array {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		System.out.println(arr.length);
		arr = new int[] { 3, 4 };
		System.out.println(arr.length);

		int[][] arr2 = { { 0, 0 }, { 0, 0 }, {0,0} };
		arr2[0] = new int[3];
		arr2[1] = new int[] {0,0,0};
	}
}
