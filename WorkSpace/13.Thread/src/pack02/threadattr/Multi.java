package pack02.threadattr;

public class Multi extends Thread {
	int n;
	
	public Multi(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
