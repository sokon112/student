package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		OutputStream out = null;
//
//		try {
//			File f = new File("/Users/kimseokhyun/javaStudyFiles/file1.txt");
//			fis = new FileInputStream(f);
//			out = System.out;
//			int data=0;
//			while((data=fis.read())!=-1) {
//				out.write(data);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		File f = new File("/Users/kimseokhyun/javaStudyFiles/file1.txt");
		try(FileInputStream fis = new FileInputStream(f);				
				OutputStream out  =System.out;
				){
			int data=0;
			while((data=fis.read())!=-1) {
				out.write(data);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
