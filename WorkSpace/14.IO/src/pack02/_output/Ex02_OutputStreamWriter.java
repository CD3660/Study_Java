package pack02._output;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex02_OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		osw.write("출력 \n 줄바꿈");
		osw.flush();
	}
}
