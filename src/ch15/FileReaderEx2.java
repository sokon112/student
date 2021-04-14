package ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderEx2 {

	public static void main(String[] args) {
		FileReader reader =null;
		FileWriter writer = null;
		try {
//			reader = new FileReader("/Users/kimseokhyun/javaStudyFiles/file1.txt");
			reader = new FileReader(
					"/Users/kimseokhyun/javaStudyFiles/file1.txt");
			writer = new FileWriter(
					"/Users/kimseokhyun/javaStudyFiles/file1copy2.txt");
			char[] ch = new char[1024];
			while(reader.read(ch)!=-1) {
				writer.write(ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
