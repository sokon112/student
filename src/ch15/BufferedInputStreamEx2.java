package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx2 {

	public static void main(String[] args) {
		try(BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(
						"/Users/kimseokhyun/javaStudyFiles/totoro.png"));
			BufferedOutputStream bos = 
					new BufferedOutputStream(new FileOutputStream(
							"/Users/kimseokhyun/javaStudyFiles/totoro2co.png"))) {
			
			int data = 0;
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
