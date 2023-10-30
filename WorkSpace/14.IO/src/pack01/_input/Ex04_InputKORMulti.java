package pack01._input;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_InputKORMulti {
	public static void main(String[] args) throws IOException {
		Ex04_InputKORMulti cd = new Ex04_InputKORMulti();
		System.out.println(cd.cd());
	}
	public String cd() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		int temp;
		String str = "";
		while((temp=isr.read())!=13) {
			str += (char)temp;
		}
		return str;
	}
}
