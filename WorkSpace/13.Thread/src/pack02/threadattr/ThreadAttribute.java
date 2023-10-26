package pack02.threadattr;

public class ThreadAttribute {
	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadA t2 = new ThreadA();
		ThreadA t3 = new ThreadA();
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
