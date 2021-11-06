package Week8;

import java.io.*;
import java.util.*;

public class practice10 {
	
	public static void PhoneSearch() {
		File src=new File(("D:\\Eclipse\\workspace\\test\\src\\Week8\\practice10_phone.txt"));
		HashMap<String,String> phone=new HashMap<>();
		String name;
		String phonenumber;
		String search;
		
		try {
		//FileReader fr=new FileReader(src);
		FileInputStream fin=new FileInputStream("D:\\Eclipse\\workspace\\test\\src\\Week8\\practice10_phone.txt");
		InputStreamReader fr=new InputStreamReader(fin,"MS949");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext()) { 
			
			name=sc.next();
			System.out.println(name);
			phonenumber=sc.nextLine();
			System.out.println(phonenumber);
			phone.put(name, phonenumber);
		}
		sc.close();
		fr.close();
		System.out.println(phone.get("백점만"));
		while(true) {
			Scanner scanner=new Scanner(System.in);
			System.out.print("이름>>");
			search=scanner.nextLine();
			if(search.equals("그만"))
				break;
			
			if(phone.containsKey(search)) {
				System.out.println(phone.get(search));
			}
			else {
				System.out.println("정보가 존재하지 않습니다.");
			}
		}
		
		
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		
		
	}
	
	public static void main(String[] args) {
				PhoneSearch();
	}
}
