package pack03.test;

import java.util.Scanner;

public class DAO {
	Horse[] horses;
	DTO dto;
	Scanner sc = new Scanner(System.in);
	
	public Horse[] initHorses(int num) {
		Horse[] horses = new Horse[num];
		for(int i=0; i<num; i++) {
			horses[i] = new Horse(i+1, dto);
		}
		return horses;
	}
	

	public DTO initDTO(int num) {
		DTO dto = new DTO();
		dto.rank = new int[num];
		return dto;
	}
	
	public DAO() {
		int num = inputNum();
		this.dto = initDTO(num);
		this.horses = initHorses(num);
	}
	
	public int inputNum() {
		while(true) {
			System.out.println("2~5의 숫자를 입력하세요.");
			int num=0;
			try {
				num = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("입력 오류 다시 입력하세요.");
				continue;
			}
			if(1<num&&num<=5) {
				return num;
			} else {
				System.out.println("입력 범위 초과");
			}
		}
	}
	
	public void race() {
		System.out.println("경주 시작");
		for(int i=0; i<horses.length; i++) {
			horses[i].start();
		}
	}
	
}
