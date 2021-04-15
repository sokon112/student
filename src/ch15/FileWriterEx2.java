package ch15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		
		
		try(Scanner sc = new Scanner(System.in);
			BufferedWriter writer = new BufferedWriter(new FileWriter(
				"/Users/kimseokhyun/javaStudyFiles/output2.txt",true))){
			System.out.println("입력 바랍니다. (종료 = q)");
			
			boolean run = true;			
			while(run) {
				System.out.print(">> ");
				String data = sc.nextLine();
				switch(data) {
				case "q":
				case "Q":
					System.out.println("종료합니다.");
					run =false;
					break;
				default:
					writer.write(data);
					writer.newLine();
					break;
				}
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
