package pack03.exarray2;

public class Test02_Array {
	public static void main(String[] args) {
		String[] dogs = {"강아지", "진돗개", "불독", "시츄"};
		String[] cats = {"페르시안", "고양이", "노르웨이"};
		for (int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i]);
		}
		for (int i=0; i<cats.length; i++) {
			System.out.println(cats[i]);
		}
		
		String[][] animals = new String[2][];
		animals[0] = dogs;
		animals[1] = cats;
		
		for (int i=0; i<animals.length; i++) {
			for (int j=0; j<animals[i].length; j++) {
				System.out.print(animals[i][j] + " ");
			}
			System.out.println();
		}
	}
}
