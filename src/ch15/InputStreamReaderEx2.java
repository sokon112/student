package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx2 {
	public static void main(String[] args) {
		
			
		try (InputStreamReader fis = new InputStreamReader(
				new FileInputStream(
						"/Users/kimseokhyun/javaStudyFiles/file1.txt"));
				FileWriter fos = new FileWriter(
						"/Users/kimseokhyun/javaStudyFiles/2output.txt")) {
			int data=0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
