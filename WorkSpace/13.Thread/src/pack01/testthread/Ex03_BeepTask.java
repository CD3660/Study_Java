package pack01.testthread;

public class Ex03_BeepTask implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("나머지 오류에 대한 처리");
			}
		}
	}
}
