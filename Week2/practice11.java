package Week2;

import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)");
		int month;
		month=sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5: {
			System.out.println("봄");
			break;
		}
		case 6:
		case 7:
		case 8: {
			System.out.println("여름");
			break;
		}
		case 9:
		case 10:
		case 11: {
			System.out.println("가을");
			break;
		}
		case 12:
		case 1:
		case 2:
		{
			System.out.println("겨울");
			break;
		}
		}
		sc.close();
	}

}
