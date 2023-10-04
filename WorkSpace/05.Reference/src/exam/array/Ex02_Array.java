package exam.array;

import java.util.Arrays;

public class Ex02_Array {
	public static void main(String[] args) {
		int[] numbers = { 3, 5, 7, 9, 1, 2, 4, 10, 8 };
		int[] numbers2 = { 3, 5, 7, 9, 1, 2, 4, 10, 8 };
		int[] numbers3 = { 3, 5, 7, 9, 1, 2, 4, 10, 8 };

		for (int i = 0; i < numbers2.length; i++) {
			for (int j = i+1; j < numbers2.length; j++) {
				if (numbers2[i] > numbers2[j]) {
				int temp = numbers2[i];
				numbers2[i]=numbers2[j];
				numbers2[j]=temp;
				}
			}
			System.out.println(Arrays.toString(numbers2));
		}
		for (int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int swap = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = swap;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		Arrays.sort(numbers3);
		for (int i = 0; i < numbers3.length; i++) {
			System.out.print(numbers3[i] + " ");
		}		
	}
}
