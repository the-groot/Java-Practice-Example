package two_weeks;

import java.util.Scanner;


public class one {
	public static void main(String args[]) {
		final int DOLLAR =1100;
		System.out.print("원화를 입력하세요(단위 원)");
		Scanner scanner=new Scanner(System.in);
		int money=scanner.nextInt();
		double dollars=(double)money/1100;
		System.out.println(money+"원은"+"$"+dollars+"입니다.");
		scanner.close();
	}

}
