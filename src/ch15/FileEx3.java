package ch15;

import java.io.File;
public class FileEx3 {
	public static void main(String[] args) {
		if(args.length!=01) {
			System.out.println("사용법 : java FileEx3 디렉토리");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은디렉토리입니다.");
			System.exit(0);
		}
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++) {
			String fileName = files[i].getName();
			System.out.println(
					files[i].isDirectory()?"["+fileName+"]":fileName);
		}
		
	}
}
