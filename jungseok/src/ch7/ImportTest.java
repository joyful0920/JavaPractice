package ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘날짜는 " + date.format(today)); // 오늘날짜는 2021/11/01
		System.out.println("현재 시간은 " + time.format(today)); // 현재 시간은 11:41:05 오전

	}

}