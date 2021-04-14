package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx5 {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		FileOutputStream out = null;
//
//		try {
//			File f = new File("/Users/kimseokhyun/javaStudyFiles/totoro.png");
//			fis = new FileInputStream(f);
//			out = new FileOutputStream("/Users/kimseokhyun/javaStudyFiles/totoro1copy.png");
//			
//			
//			byte b[] = new byte[100];
//			while(fis.read(b)!=-1) {
//				out.write(b);
//			}
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
		
		File f = new File("/Users/kimseokhyun/javaStudyFiles/totoro.png");
		try(FileInputStream fis = new FileInputStream(f);				
				FileOutputStream out  =new FileOutputStream("/Users/kimseokhyun/javaStudyFiles/totoro1copy.png");
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
