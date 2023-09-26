package pack03.exarray2;

public class Ex02_Array {
	public static void main(String[] args) {
		int [][] arr = new int[3][];
		int[] elementArr1 = new int[2];
		int[] elementArr2 = new int[3];
		arr[0] = elementArr1;
		arr[1] = elementArr2;
		arr[2] = new int[4];
		
		int count = 1;
		for (int i=0; i<arr.length; i++) {
			for (int j =0; j<arr[i].length; j++) {
				arr[i][j]=count++;
				System.out.print(i+""+j+":"+arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
