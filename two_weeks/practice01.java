package two_weeks;

import java.util.Scanner;


public class practice01 {
	public static void main(String args[]) {
		final int DOLLAR =1100;
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)");
		Scanner scanner=new Scanner(System.in);
		int money=scanner.nextInt();
		double dollars=(double)money/DOLLAR;
		System.out.println(money+"����"+"$"+dollars+"�Դϴ�.");
		scanner.close();
	}

}
