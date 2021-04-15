package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceEx1 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream(
				"/Users/kimseokhyun/javaStudyFiles/totoro.png")) {
			long start = System.currentTimeMillis();
			while(fis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream 사용시 : "+(end-start));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream(
				"/Users/kimseokhyun/javaStudyFiles/totoro.png");
			BufferedInputStream bis = new BufferedInputStream(fis)) {
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream+BufferedInputStream 사용시 : "+(end-start));
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
