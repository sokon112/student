package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(date));
	}
}
