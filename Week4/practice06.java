package Week4;

import java.util.Scanner;

class Circlee{
	private double x,y;
	private int radius;
	public Circlee(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public int getRadius() {
		return radius;
	}
}

public class practice06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circlee c[]=new Circlee[3];
		int max=0;
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			int r=sc.nextInt();
			
			c[i]=new Circlee(x,y,r);
		}
		for(int i=0; i<c.length; i++)
		if(max<c[i].getRadius())
			max=c[i].getRadius();
		for(int i=0; i<c.length; i++)
			if(max==c[i].getRadius()) {
				System.out.println("가장 면적이 큰 원은 ");
				c[i].show();
			}
		sc.close();

	}

}
