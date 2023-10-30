package pack03.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02_FileWriter {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("EX02_FileWriter\\file.txt");
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==9) {
					sb.append(i+" x "+j+" = "+(i*j)+"\n");
				} else {
					sb.append(i+" x "+j+" = "+(i*j)+" / ");
				}
			}
		}
		writer.write(sb.toString());
		
		writer.flush();
	}
}
