package two_weeks;

import java.util.Scanner;

public class practice05 {
	public static void main(String args[]) {
		int a,b,c;
		int max;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		max = (a > b && a > c) ? a : (b > c) ? b : c;
		
		if(max<(a+b+c-max))
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");
	}
}
