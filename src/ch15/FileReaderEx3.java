package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class FileReaderEx3 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader
				("/Users/kimseokhyun/Desktop/javasource/basic/src/ch15/BufferedInputStreamEx1.java"))
		){
			int count =0;
			String str = null;
			
			while((str=br.readLine())!= null) {
				count+=1;
				System.out.println(count+":\t"+str);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
