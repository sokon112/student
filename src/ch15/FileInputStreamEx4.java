package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx4 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream out = null;

		try {
			File f = new File("/Users/kimseokhyun/javaStudyFiles/test1.mp4");
			fis = new FileInputStream(f);
			out = new FileOutputStream("/Users/kimseokhyun/javaStudyFiles/test1copy.mp4");
			
			
			byte b[] = new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}
