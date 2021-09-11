package two_weeks;

import java.util.Scanner;

public class practice09 {
	public static void main(String args[]) {
		System.out.print("원의 중심과 반지름 입력");
		Scanner sc=new Scanner(System.in);
		double x,y,x1,y1,distance;
		double radius;
		x=sc.nextDouble();
		y=sc.nextDouble();
		radius=sc.nextDouble();
		System.out.print("점 입력");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		
		distance=(x1-x)*(x1-x)+(y1-y)*(y1-y);	//원의 정의 이용
		
		if(distance<=radius*radius) {
			System.out.println("점 ("+x1+","+y1+")는 원 안에 있다.");
		}
		else {
			System.out.println("점 ("+x1+","+y1+")는 원 안에 없다.");
		}
		sc.close();
	}
}
