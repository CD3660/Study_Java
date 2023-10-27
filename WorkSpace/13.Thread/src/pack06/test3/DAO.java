package pack06.test3;

import java.util.Random;
import java.util.Scanner;

public class DAO {
	Scanner sc;
	Random ran;
	DTO dto;

	public void game() {
		System.out.println("답을 맞추세요.");
		point: while (true) {
			int temp = getIntByScan();
			for (int i = 0; i < dto.arr.length; i++) {
				if (dto.arr[i] != null) {
					if (i == temp - 1) {
						System.out.println("정답 : " + (i + 1));
						dto.count++;
						System.out.println("정답까지 " + dto.count + "회");
						break point;
					} else {
						dto.count++;
						System.out.println("틀렸습니다. 다시 선택하세요.");
					}
				}
			}
		}
	}

	public DAO() {
		sc = new Scanner(System.in);
		ran = new Random();
		this.dto = new DTO();
		System.out.println("난이도를 입력하세요. (자연수)");
		dto.arr = new String[getIntByScan()];

		dto.answer = ran.nextInt(dto.arr.length);
		for (int i = 0; i < dto.arr.length; i++) {
			if (i == dto.answer) {
				dto.arr[i] = "답";
			}
		}
	}

	public int getIntByScan() {
		while (true) {
			try {
				int temp = Integer.parseInt(sc.nextLine());
				if (temp <= 0) {
					System.out.println("자연수를 입력하세요.");
				}
				return temp;
			} catch (Exception e) {
				System.out.println("잘못 된 입력");
			}
		}
	}
}
