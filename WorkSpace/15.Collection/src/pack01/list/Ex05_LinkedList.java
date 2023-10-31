package pack01.list;

import java.util.*;

public class Ex05_LinkedList {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		List<String> linkList = new LinkedList<>();
		long startTime = 0;
		long endTime = 0;
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			arrList.add(0, new String("A"));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList로 작업 시간"+(endTime-startTime));
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			linkList.add(0, new String("A"));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 작업 시간"+(endTime-startTime));
		
	}
}
