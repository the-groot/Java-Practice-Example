package Week8;

import java.util.Scanner;
import java.io.*;


public class practice02 {
	
	public static void PhoneBook(File src){
		
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner sc=new Scanner(System.in);
		String name;
	    String phonenumber;
	    FileWriter fw=null;
	    FileReader fr=null;
	    int c;
	    
	    try {
	    
	    fr=new FileReader("D:\\Eclipse\\workspace\\test\\src\\Week8\\phone.txt");
	    fw=new FileWriter(src,true);
	    
	    while ((c = fr.read()) != -1) {
	    	System.out.print((char)c);
	    }
	    fr.close();
	    
	    
	   /* while(true) {
	    	System.out.print("이름 전화번호>>");
			name=sc.next();
			if(name.equals("그만")) {
				fw.close();
				break;
			}
			phonenumber=sc.nextLine();
			
			
			fw.write(name);
			fw.write(phonenumber+"\r\n");
		
		}*/
	    
	    } catch(IOException e) {
	    	System.out.println("파일 복사 오류");
	    }
		
		
		
		sc.close();
	}
	
	public static void main(String[] args) {
		File src=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\phone.txt");
		PhoneBook(src);
	}
}
