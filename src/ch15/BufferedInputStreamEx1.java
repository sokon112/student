package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream(
				"/Users/kimseokhyun/javaStudyFiles/file1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(
					"/Users/kimseokhyun/javaStudyFiles/2output1.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data = 0;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
