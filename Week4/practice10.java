package Week4;

import java.util.Scanner;

class Dictionary{
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng (String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return "false";
	}
}

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc=new Scanner(System.in);
		String command;
		String search_result;
		
		while(true) {
			System.out.print("한글 단어?");
			command=sc.next();
			if(command.equals("그만")) {
				break;
			}
			
			search_result=Dictionary.kor2Eng(command);
			
			if(search_result.equals("false"))
				System.out.println(command+"는 저의 사전에 없습니다.");
			else
				System.out.println(command+"은 "+search_result);
			
		}
		sc.close();
	}

}
