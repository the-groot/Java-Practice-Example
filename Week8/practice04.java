package Week8;

import java.io.*;
import java.util.*;

public class practice04 {
	public static void main(String[] args) {
		
		File src=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\system.ini");
		FileReader fr=null;
		System.out.println(src.getPath()+" 파일을 읽어 출력합니다.");
		
		try{
			fr=new FileReader(src);
			Scanner sc=new Scanner(fr);
			
			int c;
			int lineNumber=1;
			while(sc.hasNext()) {
				String line=sc.nextLine();
				System.out.print(lineNumber++ +":  ");
				System.out.println(line);
			}
	
			fr.close();
			sc.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
	
	}
}
