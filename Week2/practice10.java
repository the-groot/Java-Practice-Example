package Week2;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1,y1,r1;
		int x2,y2,r2;
		int distance;
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�");
		x1=sc.nextInt();
		y1=sc.nextInt();
		r1=sc.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�");
		x2=sc.nextInt();
		y2=sc.nextInt();
		r2=sc.nextInt();
		distance=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		if(r2+r1>=Math.sqrt(distance)) {
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		sc.close();
	}

}
