package pack01.testthread;

public class Ex03_BeepMain {
	public static void main(String[] args) throws InterruptedException {
		Runnable run = new Ex03_BeepTask();
		Thread thread = new Thread(run);
		thread.start();
		for(int i=0; i<5; i++) {
			System.out.println("메인");
			Thread.sleep(500);
		}
	}
}
