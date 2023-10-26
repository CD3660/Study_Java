package pack03.test;

import java.util.Random;

public class Horse extends Thread {
	int idx;
	Random random = new Random();
	DTO dto;
	int run;
	@Override
	public void run() {
		while (true) {
			run += random.nextInt(10) + 1;
			if(run >= 100) {
				break;
			}
			System.out.println(idx + "번 말 " + run + "미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dto.setRank(idx);
		if(dto.rank[dto.rank.length-1]!=0) {
			System.out.println("최종 순위");
			for(int i=0; i<dto.rank.length; i++) {
				System.out.println((i+1) + "등 : " + dto.rank[i] + "번 말");
			}
		}
	}

	public Horse(int idx, DTO dto) {
		this.dto = dto;
		this.idx = idx;
	}

}
