package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		OutputStream out = null;
//
//		try {
//			File f = new File("/Users/kimseokhyun/javaStudyFiles/file1.txt");
//			fis = new FileInputStream(f);
//			out = System.out;
//			
//			
//			byte b[] = new byte[100];
//			while(fis.read(b)!=-1) {
//				out.write(b);
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
			byte b[] = new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
