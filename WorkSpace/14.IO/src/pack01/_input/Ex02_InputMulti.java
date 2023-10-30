package pack01._input;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputMulti {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int data;
		while ((data=is.read())!=-1) {
			System.out.println("입력하신 문자 int : "+data);
			System.out.println("입력하신 문자 char : "+(char)data);
		}
		System.out.println("프로그램 종료");
	}
}
