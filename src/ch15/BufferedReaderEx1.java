package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try(BufferedReader br = 
				new BufferedReader(new FileReader(
						"/Users/kimseokhyun/javaStudyFiles/file1.txt"));
			BufferedWriter bw = 
				new BufferedWriter(new FileWriter(
						"/Users/kimseokhyun/javaStudyFiles/2file3.txt"))) {
			String str =null;
			while((str=br.readLine())!=null) {
				bw.write(str);
				bw.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
