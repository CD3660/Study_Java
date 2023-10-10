package pack01.method;

public class Car {

	public void cdMethod() {
		System.out.println("void는 return 타입이 없다.");
		System.out.println("현재 메소드는 클래스의 블럭킹 내부에 있다.");
		System.out.println("cdMethod는 클래스의 멤머, 인스턴스 멤버");

	}

	public void cdMethod1(String name) {
		System.out.println(name + " 이(가) 공부 중");
	}
	public void cdMethod2(String name, String state) {
		System.out.println(name + " 이(가) "+state+" 중");
	}
	public void cdMethod3(String name, int price) {
		System.out.println(name + "의 가격은 "+price+"원 입니다.");
	}
	public void cdMethod4(String name, int stock) {
		System.out.println(name + "의 재고는 "+stock+"개 입니다.");
	}
	public void cdMethod5(int num) {
		for (int i=0; i<num; i++) {
			System.out.print("출력");
			if (i==num-1) {
				System.out.println();
			}
		}
	}
	public int rtnMethod1() {
		System.out.println("rtnMethod");
		return 1;
	}
	public int rtnMethod2(int num) {
		System.out.println("rtnMethod2");
		return num;
	}
}
