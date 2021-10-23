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
		dic.put("eye", "��");
		dic.put("human", "�ΰ�");
		dic.put("fault", "����");
		dic.put("emotion", "����");
		dic.put("painting", "�׸�");
		dic.put("animal", "����");
		dic.put("apple", "���");
		dic.put("juice", "�ֽ�");
		dic.put("hiphop", "����");
		dic.put("calendar", "�޷�");
		dic.put("mirror", "�ſ�");
		dic.put("face", "��");
		dic.put("wallet", "����");
		dic.put("watch", "�ո�ð�");
		dic.put("mask", "����ũ");
		dic.put("mouth", "��");
		dic.put("mouse", "���콺");
	
		
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�. ****");
		
		while(run) {
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>>");
			
			try{command=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("�ٽ� �Է��ϼ���");
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
				System.out.println("���� "+dic.size()+"���� �ܾ ��� �ֽ��ϴ�.");
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
					System.out.println("���ڸ� �Է��ϼ���!!");
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
				System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
				while(true) {
					System.out.print("���� �ѱ� �Է� >>");
					english=sc.next();
					korean=sc.next();
					if(korean.equals("�׸�"))
						break;
					dic.put(english, korean);
				}
				break;
			}
			case 3:{
				System.out.println("\"��ǰ����\"�� �����մϴ�.");
				run=false;
				break;
			}
			}
		}
		sc.close();
	}
}
