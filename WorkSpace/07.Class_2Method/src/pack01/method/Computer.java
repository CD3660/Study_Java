package pack01.method;

public class Computer {
	
	boolean isPower;
	public void power() {
		isPower = !isPower;
		System.out.println("전원"+isPower);
	}
	public void plus(int a, int b) {
		if (isPower) {
			System.out.println(a+b);
		} else {
			System.out.println("컴퓨터의 전원을 켜주세요");
		}
	}
}
