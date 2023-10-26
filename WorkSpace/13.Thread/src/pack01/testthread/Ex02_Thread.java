package pack01.testthread;

import java.awt.Toolkit;

public class Ex02_Thread {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					Toolkit.getDefaultToolkit().beep();;
					System.out.println("삑");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		Thread thread = new Thread(run);
		thread.start();
		System.out.println("여기는 메인 메소드 스레드 코드");
	}
}
