package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyEx {

	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}