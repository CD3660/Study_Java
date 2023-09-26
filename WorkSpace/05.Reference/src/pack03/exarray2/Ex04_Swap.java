package pack03.exarray2;

public class Ex04_Swap {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1+" "+num2);
		int tempNum = num1;
		num1 = num2;
		num2 = tempNum;
		System.out.println(num1+" "+num2);
		
		int[] arr = { 3,5,7,9,1,2,4,10};

	
		for (int i=0; i<arr.length; i++) {
			int max = 0;
			int num=0;
			for (int j=i; j<arr.length; j++) {
				if (arr[j]>max) {
					max = arr[j];
					num = j;
				}
			}
			int temp =0;
			temp=arr[num];
			arr[num]=arr[i];
			arr[i]=temp;
		}
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
