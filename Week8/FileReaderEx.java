package Week8;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin=null;
		
		try {
			fin=new FileReader("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-1.txt");
			int c;
			while((c=fin.read())!=-1) {
				System.out.println((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
