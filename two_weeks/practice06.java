package two_weeks;

import java.util.Scanner;

public class practice06 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int num,game_count=0;
		System.out.print("1~99 사이의 정수를 입력하시오");
		num=sc.nextInt();
		
		if(num>=10) {
			if((num/10)%3==0) {	//십의자리가 3의배수인지 체크
				game_count++;
			}
			if((num%10)%3==0) {	//일의자리가 3의배수인지 체크
				if(num%10==0) {		//num이 10의배수이면 num%10%3이 0인데 3의배수가 아니므로 미리하나빼준다
 					game_count--;
				}
				game_count++;
			}
		}
	
	else {
		if((num%10)%3==0) {		//일의자리가 3의배수인지 체크
			game_count++;
		}
	}
		
		
		switch(game_count) {
		case 2: {
			System.out.println("박수짝짝");
			break;
		}
		case 1: {
			System.out.println("박수짝");
			break;
		}
		}

	}
}