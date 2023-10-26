package pack01.testthread;

public class Ex04_ThreadTask extends Thread {
	private String tastName = "Ex04_ThreadTask";
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(tastName+" "+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Ex04_ThreadTask(String tastName) {
		this.tastName = tastName;
	}
	
}
