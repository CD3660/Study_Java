package exam.array;

import java.util.Arrays;

public class Ex01_Array {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] tempArray = new int[10];
		for (int i = 0; i<tempArray.length; i++) {
			for (int j=0; j<numbers.length; j++) {
				if (numbers[j]==i) {
					tempArray[i]++;
				}
			}
		}
		int sum = 0;
		System.out.println(Arrays.toString(tempArray));
		for (int i=0; i<tempArray.length; i++) {
			if (tempArray[i]==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}
