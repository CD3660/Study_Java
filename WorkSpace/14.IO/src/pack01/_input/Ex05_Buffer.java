package pack01._input;

import java.io.*;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		System.out.println(data);
		br.close();
	}
}
