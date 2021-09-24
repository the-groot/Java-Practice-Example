package Week4;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	Rectangle(){};
	
	public double getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		Rectangle rec=new Rectangle();
		Scanner sc=new Scanner(System.in);
		
		rec.width=sc.nextInt();
		rec.height=sc.nextInt();
		area=rec.getArea();
		System.out.println("사각형의 넓이 :"+area);
		
		sc.close();
	}

}
