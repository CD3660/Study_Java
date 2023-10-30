package pack01._input;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_InputKOR {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			int data = isr.read();
			System.out.println(data);
			System.out.println((char)data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
