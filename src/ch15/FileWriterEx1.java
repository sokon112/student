package ch15;

import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter(
				"/Users/kimseokhyun/javaStudyFiles/output1.txt",true)){
			writer.write("FileWriter는 한글로 된 \r\n");
			writer.write("문자열을 바로 출력 가능\r\n");
			writer.write("Writer 클래스는 문자 단위의\r\n");
			writer.write("출력만 가능.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
