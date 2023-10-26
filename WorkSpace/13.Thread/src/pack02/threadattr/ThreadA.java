package pack02.threadattr;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(getName()+" 실행중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
