package pack03.exarray2;

public class Test01_Array {
	public static void main(String[] args) {
		int[][] multi = new int[8][9];
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				multi[i][j] = (i + 2) * (j + 1);
				System.out.println((i + 2) + " x " + (j + 1) + " = " + multi[i][j]);
			}
		}
	}
}
