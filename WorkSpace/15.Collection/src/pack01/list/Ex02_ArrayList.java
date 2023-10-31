package pack01.list;

import java.util.ArrayList;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<>();
		boolean isAdd = iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		iList.add(5);		
		iList.remove(0);
		System.out.println(iList.get(0)+""+isAdd);
		System.out.println(iList.contains(1)+" 1 있음.");
		System.out.println(iList.contains(6)+" 6 없음.");
		System.out.println(iList.isEmpty() + "비어있는지 확인.");
		iList.clear();
		System.out.println(iList.isEmpty() + "비어있는지 확인.");
	}
}
