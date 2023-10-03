package quest02;

import java.util.Scanner;

public class Step05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		int dataA = Integer.parseInt(str1);
		int dataB = Integer.parseInt(str2);
		System.out.println("입력 된 데이터 : dataA: "+ dataA + ", dataB : "+ dataB);
		System.out.print("출력 데이터 : ");
		int from, to;
		int sum = 0;
		if (dataA<dataB) {
			from = dataA;
			to = dataB;
		} else {
			from = dataB;
			to = dataA;
		} 
		for (int i = from; i<=to; i++) {
			System.out.print(i);
			if (i==to) {
				sum += i;
				System.out.print(" = "+sum+" 입니다.");
			} else {
				System.out.print(" + ");
				sum += i;
			}
		}
		
	}
}
