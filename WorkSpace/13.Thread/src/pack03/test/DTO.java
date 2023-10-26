package pack03.test;

public class DTO {
	int[] rank;
	public void setRank(int idx) {
		for(int i=0; i<rank.length; i++) {
			if(rank[i]==0) {
				rank[i]=idx;
				System.out.println(idx + "번 말 " + "완주");
				break;
			}
		}
	}
}
