package two_weeks;

import java.util.Scanner;

public class practice09 {
	public static void main(String args[]) {
		System.out.print("���� �߽ɰ� ������ �Է�");
		Scanner sc=new Scanner(System.in);
		double x,y,x1,y1,distance;
		double radius;
		x=sc.nextDouble();
		y=sc.nextDouble();
		radius=sc.nextDouble();
		System.out.print("�� �Է�");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		
		distance=(x1-x)*(x1-x)+(y1-y)*(y1-y);	//���� ���� �̿�
		
		if(distance<=radius*radius) {
			System.out.println("�� ("+x1+","+y1+")�� �� �ȿ� �ִ�.");
		}
		else {
			System.out.println("�� ("+x1+","+y1+")�� �� �ȿ� ����.");
		}
		sc.close();
	}
}
