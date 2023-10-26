package pack02.threadattr;

public class Main {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		System.out.println(tA.getName());
		System.out.println(tB.getName());
		
		tA.start();
		tB.start();
	}
}
