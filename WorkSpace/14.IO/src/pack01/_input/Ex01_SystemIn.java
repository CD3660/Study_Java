package pack01._input;

import java.io.*;

public class Ex01_SystemIn {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int inData = in.read();
		System.out.println(inData);
		System.out.println((char)inData);
		System.out.println(in.read());
		System.out.println(in.read());
		System.out.println(in.read());
		System.out.println(in.read());
		
	}
}
