package pack01.testthread;

import java.awt.Toolkit;

public class Ex01_Thread {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		tk.beep();
		
		for (int i = 0; i < 5; i++) {
			tk.beep();
			System.out.println("띠링");
			try {
				Thread.sleep(1000 * 2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
