package tetete;

public class B extends Parents {
	int a;
	int[] arr;
	public void methodB() {
		System.out.println(arr.length);
	}
	public B(String str) {
		super(str);
		this.str = "슈퍼B";
		this.a = 10;
		this.arr = new int[5];
	}
}
