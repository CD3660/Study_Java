package pack03.test;

import java.util.Random;

public class Download extends Thread{
	int timer;
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(getName()+" 다운로드 중 "+i+"%");
			try {
				Thread.sleep(timer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName()+" 다운로드 완료");
	}
	
	public Download(String name) {
		this.setName(name);
		this.timer = new Random().nextInt(200)+200;
	}
}
