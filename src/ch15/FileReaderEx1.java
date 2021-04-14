package ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx1 {

	public static void main(String[] args) {
		FileReader reader =null;
		try {
//			reader = new FileReader("/Users/kimseokhyun/javaStudyFiles/file1.txt");
			reader = new FileReader("/Users/kimseokhyun/javaStudyFiles/file1.txt");
			int ch=0;
			while((ch =reader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
