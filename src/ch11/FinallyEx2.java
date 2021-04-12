package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyEx2 {
	public static void main(String[] args) {
		
		
	
		try (FileInputStream fis 
				= new FileInputStream("input.txt");
			FileOutputStream fos 
			= new FileOutputStream("");){
		} catch (Exception e) {
			e.printStackTrace();
		}
//		}finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}

}