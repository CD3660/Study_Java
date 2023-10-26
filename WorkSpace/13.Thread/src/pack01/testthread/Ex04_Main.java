package pack01.testthread;

public class Ex04_Main {
	public static void main(String[] args) {
		Thread t1 = new Ex04_ThreadTask("작업1");
		Thread t2 = new Ex04_ThreadTask("작업2");
		Thread t3 = new Thread(()-> {
			System.out.println("작업3");
		});
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("작업 4");
				
			}
		});
		Thread t5 = new Thread() {
			@Override
			public void run() {
				System.out.println("작업 5");
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("메인 스레드");
	}
}
