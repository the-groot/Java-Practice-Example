package two_weeks;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�");
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		
		if((100<=x&&x<=200) && (100<=y && y<=200)) {
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else {
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		}
		sc.close();
	}

}
