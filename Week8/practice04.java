package Week8;

import java.io.*;
import java.util.*;

public class practice04 {
	public static void main(String[] args) {
		
		File src=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\system.ini");
		FileReader fr=null;
		System.out.println(src.getPath()+" ������ �о� ����մϴ�.");
		
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
			System.out.println("����� ����");
		}
		
	
	}
}
