package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {

	public static void main(String[] args) {
		try(BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(
						"/Users/kimseokhyun/javaStudyFiles/test1.mp4"));
			BufferedOutputStream bos = 
					new BufferedOutputStream(new FileOutputStream(
							"/Users/kimseokhyun/javaStudyFiles/test1co.mp4"))) {
			
			int data = 0;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
