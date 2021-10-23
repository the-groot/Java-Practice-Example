package Week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class practice12 {
	public static void main(String[] args) {
		int command;
		int count=1;
		int dic_count=0;
		boolean run=true;
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> dic=new HashMap<>();
		ArrayList<String> answerlist=new ArrayList<String>();
		dic.put("eye", "눈");
		dic.put("human", "인간");
		dic.put("fault", "오류");
		dic.put("emotion", "감정");
		dic.put("painting", "그림");
		dic.put("animal", "동물");
		dic.put("apple", "사과");
		dic.put("juice", "주스");
		dic.put("hiphop", "힙합");
		dic.put("calendar", "달력");
		dic.put("mirror", "거울");
		dic.put("face", "얼굴");
		dic.put("wallet", "지갑");
		dic.put("watch", "손목시계");
		dic.put("mask", "마스크");
		dic.put("mouth", "입");
		dic.put("mouse", "마우스");
	
		
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		
		while(run) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>>");
			
			try{command=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("다시 입력하세요");
				sc.next();
				continue;
			}
			switch(command) {
			case 1:{
				int user_answer=0;
				dic_count=0;
				String eng=null, kor=null;
				String kor_answer=null;
				int random=(int)(Math.random()*10)%3+1;
				int answer=(int)(Math.random()*10)%dic.size()+1;
				while(answer>dic.size()-3)
					answer=(int)(Math.random()*10)%dic.size()+1;
				System.out.println("현재 "+dic.size()+"개의 단어가 들어 있습니다.");
				Set<String> key=dic.keySet();
				
				Iterator<String> it=key.iterator();
				
				while(dic_count<count) {
					it.hasNext();
					 eng=it.next();
					 kor=dic.get(eng);
					dic_count++;
				}
				System.out.println(eng+"?");
				kor_answer=kor;
				
				it=key.iterator();
				for(int i=0; i<answer; i++) {
				eng=it.next();
				}
				for(int i=answer; i<=answer+3; i++) {
					kor=dic.get(eng);
					answerlist.add(kor);
					eng=it.next();
				}
				if(!answerlist.contains(kor_answer))
				answerlist.add(random,kor_answer);
				for(int i=0; i<4; i++) {
					System.out.print("("+(i+1)+")"+answerlist.get(i));
				}
				System.out.print(" :>");
				try {
				user_answer=sc.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("숫자를 입력하세요!!");
					sc.next();
					continue;
				} 
				if(answerlist.get(user_answer-1).equals(kor_answer)) {
					System.out.println("Excellent !!");
				}
				else {
					System.out.println("No. !!");
				}
				answerlist.clear();
				System.out.println();
				count++;
				break;
			}
			case 2:{
				String korean, english;
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				while(true) {
					System.out.print("영어 한글 입력 >>");
					english=sc.next();
					korean=sc.next();
					if(korean.equals("그만"))
						break;
					dic.put(english, korean);
				}
				break;
			}
			case 3:{
				System.out.println("\"명품영어\"를 종료합니다.");
				run=false;
				break;
			}
			}
		}
		sc.close();
	}
}
