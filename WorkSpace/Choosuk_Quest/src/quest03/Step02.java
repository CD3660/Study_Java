package quest03;

public class Step02 {
	public static void main(String[] args) {
		int[] numbers = { 3 , 5 ,7 , 9 , 1 , 2 , 4 , 10, 8};
		
		for (int i =0; i<numbers.length-1; i++) {
			for (int j=0; j<numbers.length-1; j++) {
				if (numbers[j] > numbers[j+1]) {
					int swap = numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j] = swap;
				}
			}
		}
		for (int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
	}
}
