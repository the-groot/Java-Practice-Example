package Week8;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin=null;
		int c;
		try {
			fin=new FileReader("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-7.txt");
			//fin은 파일을 읽는 변수
			BufferedOutputStream out=new BufferedOutputStream(System.out,5);
			//out은 바이트단위의 바이너리 데이터를 처리하는 버퍼 스트림
			while((c=fin.read())!=-1) {
				out.write(c);	//버퍼가 꽉찰때까지 화면에 출력
			}
			new Scanner(System.in).nextLine();	//enter키 기다림
			out.flush();	//버퍼에 남아있던 무나 모두 출력
			fin.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
