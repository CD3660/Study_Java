package pack04.lamda;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		LamdaInter lamda = new LamdaInter() {
			
			@Override
			public void method() {
				System.out.println("람다 메소드");
			}
		};
		lamda.method();
		lamda =()->{
			System.out.println("람다 메소드 2");
		};
		lamda.method();
		
		List<Integer> li = new ArrayList<>();
//		li.forEach(t -> 코드부);
		
	}
}
