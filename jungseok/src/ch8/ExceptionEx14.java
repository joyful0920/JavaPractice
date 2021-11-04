package ch8;

import java.io.File;

public class ExceptionEx14 {

	public static void main(String[] args) {
		// command line에서 입력받은 값을 이름으로 갖는 파일 생성
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	}
	
	
	// 예외가 발생한 메소드에서 직접 예외 처리
	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않습니다.");
		} catch (Exception e) {
			// fileName이 부적절한 경우, 파일 이름을 '제목없음.txt'로
			fileName = "제목없음.txt";
		} finally { // finally는 예외 발생 여부와 관계없이 파일 생성 역할
			File f = new File(fileName); // File 클래스의 객체 생성
			createNewFile(f); // 생성된 객체를 이용해서 파일 생성
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile(); // 파일 생성
		} catch (Exception e) { }
	}

}