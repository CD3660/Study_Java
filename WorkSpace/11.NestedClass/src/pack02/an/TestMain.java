package pack02.an;

public class TestMain {
	public static void main(String[] args) {
		TestClass tc = new TestClass() {
			int testField2 = 30;
			@Override
			void testMethod() {
				System.out.println("익명 지역에서 메소드 재정의"+testField2);
			}
		};
		tc.testField = 3;
		tc.testMethod();
		
		TestInterface[] tiArr = new TestInterface[10];
		TestInterface tiNull = null;
		
		TestInterface ti = new TestInterface() {
			int num = 10;
			@Override
			public void method() {
				System.out.println("인터페이스 인스턴스화"+num);
			}
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
		};
		ti.method();
		
		ti = new a();
		ti.method();

	}
}
