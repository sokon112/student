package ch15;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		
			
		try (InputStreamReader fis = 
				new InputStreamReader(
						new FileInputStream(
								"/Users/kimseokhyun/javaStudyFiles/file1.txt"))) {
			int data=0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
