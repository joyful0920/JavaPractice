package ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���ó�¥�� " + date.format(today)); // ���ó�¥�� 2021/11/01
		System.out.println("���� �ð��� " + time.format(today)); // ���� �ð��� 11:41:05 ����

	}

}