package two_weeks;

import java.util.Scanner;

public class practice08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
		return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result;
		Scanner sc=new Scanner(System.in);
		int x1,y1,x2,y2;
		System.out.print("(x1,y1)을 입력하시오");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.print("(x2,y2)을 입력하시오");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		result=inRect(x1,y2,100,100,200,200);
		
		if(result) {
			System.out.println("충돌한다.");
		}
		else {
			System.out.println("충돌안한다");
		}
		sc.close();
	}

}
