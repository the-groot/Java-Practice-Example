package Week3;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String command;
		int random;
		String str[]= {"가위","바위","보"};
		
		while(true){
			System.out.print("가위 바위 보!>>");
			command=sc.next();
			random=(int)(Math.random()*3);
			
			if(command.equals("그만")) {				//그만 입력했을때
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			
			
			else {		//그만 입력안했을때
				if(!(command.equals("바위")) && !(command.equals("가위")) && !(command.equals("보"))){
					//가위 바위 보 말고 다른 문자를 입력했을때 continue
					System.out.println("가위 바위 보 중 하나를 다시 입력하시오.");
					continue;
				}
			
			if(str[random].equals("바위")) {		//그 외에는 가위, 바위, 보를 입력했으므로 컴퓨터와 비교 후 결과 출력
				if(command.equals("바위")) 
					System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				else if(command.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 사용자가 졌습니다.");
				else
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
			}
			
			else if(str[random].equals("가위")) {
				if(command.equals("바위")) 
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				else if(command.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				else
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 사용자가 졌습니다.");
			}
			
			else if(str[random].equals("보"))	{
				if(command.equals("바위")) 
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 사용자가 졌습니다.");
				else if(command.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				else
					System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
			}
			
			
		}
		}
		sc.close();
	}

}
