package quest02;

import java.util.Scanner;

public class Step03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		int dataA = Integer.parseInt(str1);
		int dataB = Integer.parseInt(str2);
		System.out.println("입력 된 데이터 : dataA: "+ dataA + " , dataB : "+ dataB);
		String calc = dataA>dataB?">":dataA<dataB?"<":"==";
		System.out.println("비교 후 데이터 : dataA: ("+ dataA +") "+ calc+" dataB : ("+ dataB+")");
	}
}
