package Week3;

import java.util.Scanner;

public class practice14 {
	public static void main(String args[]) {
		String course [] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		Scanner sc=new Scanner(System.in);
		String command;
		while(true) {
			int subject_check=0;	//과목 존재여부 체크하는 변수
			System.out.print("과목 이름>>");
			command=sc.next();
			if(command.equals("그만")) {	//그만 입력받으면 탈출
				break;
			}
			
			for(int i=0; i<course.length; i++) {
			if(course[i].equals(command)) {
				System.out.println(course[i]+"의 점수는 "+score[i]);
				subject_check=1;	
			}
			}
			if(subject_check!=1)		//반복문 싹 돌았는데 과목이 존재하지 않으면 없는과목 문구 출력 
				System.out.println("없는 과목입니다.");
				
			
		}
		sc.close();
	}
}
