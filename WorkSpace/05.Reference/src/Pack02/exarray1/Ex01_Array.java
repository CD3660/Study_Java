package Pack02.exarray1;

public class Ex01_Array {
	public static void main(String[] args) {
		
		int[] scoreArr = new int[10];
		
		for (int i=0; i<10;i++) {
			scoreArr[i]=i+1;
		}
		for (int i=0; i<10; i++) {
			System.out.println("score"+(i+1)+" : "+scoreArr[i]);
		}
	}
}
