package Pack02.exarray1;

public class Test02_Array {
	public static void main(String[] args) {
		int[] multi = new int[9];
		for (int i=0; i<9; i++) {
			multi[i] = (i+1) * 2;
			System.out.println("2 x " + (i+1) +" = " + multi[i]);
		}
		
		String[] star = new String[5];
		for (int i=0; i<5; i++) {
			star[i]="";
			for (int j = 0; j<= i ; j++) {
				star[i] += "★";
			}
			System.out.println(star[i]);
		}

	}
}
