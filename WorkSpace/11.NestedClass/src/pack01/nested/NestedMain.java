package pack01.nested;

import pack01.nested.CDNested.CD1;
import pack01.nested.CDNested.CD1.Test;
import pack01.nested.CDNested.CD1.Test.CD4.CD5;
import pack01.nested.Nested.NesInner;
import pack01.nested.Nested.NesInner2;

public class NestedMain {
	public static void main(String[] args) {
		//스태틱 멤버 
		Nested.field2 = 2;
		Nested.method2();
		
		//인스턴스 멤버
		Nested nes = new Nested();
		nes.field = 1;
		nes.method();
		
		NesInner inner = nes.new NesInner();
		inner.iField = "inner";
		inner.iMethod();
		
		System.out.println(NesInner2.sField);
		NesInner2 nesInner2 = new NesInner2();
		nesInner2.iField = "inner";
		nesInner2.iMethod();
		
		nes.nesInner3();		
	}
}
