package quest01;

import java.util.Scanner;

public class Step01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int iData = Integer.parseInt(str);
		System.out.println("사용자가 입력 한 값 : " + str);
		System.out.println("iData에 담긴 값 : iData (" + iData + ")");
		str = scan.nextLine();
		double dData = Double.parseDouble(str);
		System.out.println("사용자가 입력 한 값 : " + str);
		System.out.println("dData변수에 담긴 값 : dData ("+dData+")");
	}
}
