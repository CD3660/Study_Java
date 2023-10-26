package pack02.threadattr;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("병식");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName()+" 실행중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
