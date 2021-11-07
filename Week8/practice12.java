package Week8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class practice12 {
	
	String path=System.getProperty("user.dir");
	String filename=null;
	String key=null;
	Scanner sc=new Scanner(System.in);
	FileReader fr;
	Vector<String> vector=new Vector<>();
	Vector<Integer> linenumber=new Vector<>();
	
	practice12() {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		path=path+"\\src\\Week8\\";
		System.out.print("대상 파일명 입력>> ");
		filename=sc.nextLine();
		path=path+filename;		//path 최신화
		
		while(true) {
		
		System.out.print("검색할 단어나 문장>> ");
		key=sc.nextLine();
		if(key.equals("그만"))
			break;
		
		
		
		try{
			
			fr=new FileReader(path);	//파일 객체 생성
			Scanner sc2=new Scanner(fr);	//scanner로 한줄씩입력받을 것임
			
			while(sc2.hasNext()) {
				String line=sc2.nextLine();
				vector.add(line);
			}
			sc2.close();
			
			for(int i=0; i<vector.size(); i++) {
				String line=vector.get(i);
				if(line.indexOf(key)!=-1)		//검색하는 키가있을때
					linenumber.add(i);	//라인넘버 추가
			}
			
			for(int i=0; i<linenumber.size(); i++) {
				int linenum=linenumber.get(i);
				String line=vector.get(linenum);
				System.out.println(linenum+":\t"+line);
			}
			
			linenumber.clear();
			vector.clear();
		
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		}
		sc.close();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new practice12();
		
	}
	
}


