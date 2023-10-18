package exam.testabstract;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.breathe();
		
		Animal animal = new Dog();
		
		animal.breathe();
		System.out.println(animal.eat("사료")+10);
	}
}
