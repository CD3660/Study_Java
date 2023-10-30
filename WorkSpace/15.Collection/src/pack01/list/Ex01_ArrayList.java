package pack01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		arr[4] = "E";
		
		String[] temp = new String[6];
		for(int i=0; i<5; i++) {
			temp[i] = arr[i];
		}
		temp[5] = "F";
		arr = temp;
		System.out.println(Arrays.toString(arr));
		
		List<String> li = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			li.add(arr[i]);			
		}
		System.out.println(li.toString());
		System.out.println(li.size());
		System.out.println(li.get(0));
		
		for (String string : li) {
			System.out.print(string+" ");
		}
		System.out.println();
		
	}
}
