package pack01.nested;

import pack01.nested.CDNested.CD1.Test;
import pack01.nested.CDNested.CD1.Test.CD4.CD5;

public class CDNested {
	public static class CD1 {
		public class Test {
			String str = "변수";
			public class CD4 {
				public class CD5 {
					private class CD2 {
						void method2() {
							System.out.println("str과 메소드 출력시 성공");
						}
					}
					public CD5() {
						CD2 cd2 = new CD2();
						cd2.method2();
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Test test = new CDNested.CD1().new Test();
		System.out.println(test.str);
		CD5 cd5 = test.new CD4().new CD5();
	}
}
