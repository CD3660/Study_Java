package pack01.nested;

public class Nested {
	public int field;
	public static int field2;
	public void method() {
		System.out.println("메소드 1");
		System.out.println(field2);
	}
	public static void method2() {
		System.out.println("메소드 2");
	}
	
	public class NesInner {
		String iField;
		public void iMethod() {
			System.out.println("i메소드");
		}
	}
	
	public static class NesInner2 {
		static String sField="ON";
		String iField;
		public void iMethod() {
			System.out.println("istatic메소드");
		}
	}
	
	public void nesInner3() {
		class NesInner3{
			String iField;
			public void iMethod() {
				System.out.println("메소드");
			}
		}
		NesInner3 nes = new NesInner3();
		nes.iField ="in";
		System.out.println(nes.iField);
		nes.iMethod();		
	}
	
	
}
