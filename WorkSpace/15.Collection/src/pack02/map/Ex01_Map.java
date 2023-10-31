package pack02.map;

import java.util.HashMap;

public class Ex01_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "임꺽정");
		map.put(1, "이몽룡");
		map.put(2, "성춘향");
		map.remove(2);
		System.out.println(map.get(1));
		System.out.println(map.size());
	}
}
