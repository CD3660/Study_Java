package pack01.list;

import java.util.ArrayList;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		ArrayList<DepartmentDTO> list = new ArrayList<>();
		DepartmentDTO dto1 = new DepartmentDTO(1, 1, 1, "이름1");
		DepartmentDTO dto2 = new DepartmentDTO(2, 2, 2, "이름2");
		DepartmentDTO dto3 = new DepartmentDTO(3, 3, 3, "이름3");
		DepartmentDTO dto4 = new DepartmentDTO(4, 4, 4, "이름4");
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		System.out.println(list.get(0).getDepartmentName());
		System.out.println(list.get(1).getDepartmentName());
		System.out.println(list.get(2).getDepartmentName());
		System.out.println(list.get(3).getDepartmentName());
		
	}
}
