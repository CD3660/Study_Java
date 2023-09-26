package pack03.exarray2;

public class Ex01_Array {
	public static void main(String[] args) {
		int[][] arr = new int[2][4];
		
		int count =1;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = count;
				count++;
				System.out.println(arr[i][j]);
			}
		}
	}
}
