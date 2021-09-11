package two_weeks;
import java.util.Scanner;

public class practice03 {
	public static void main(String args[]) {
		int a=50000,b=10000,c=1000,d=100,e=50,f=10,g=1;
		int a_count=0,b_count=0,c_count=0,d_count=0,e_count=0,f_count=0,g_count=0;
		System.out.println("금액을 입력하시오");
		Scanner scanner=new Scanner(System.in);
		int cash=scanner.nextInt();
		
		a_count=cash/a;
		cash=cash-a_count*a;
		b_count=cash/b;
		cash=cash-b_count*b;
		c_count=cash/c;
		cash=cash-c_count*c;
		d_count=cash/d;
		cash=cash-d_count*d;
		e_count=cash/e;
		cash=cash-e_count*e;
		f_count=cash/f;
		cash=cash-f_count*f;
		g_count=cash/g;
		
		System.out.println("오만원권 "+a_count+"매");
		System.out.println("만원권 "+b_count+"매");
		System.out.println("천원권 "+c_count+"매");
		System.out.println("백원 "+d_count+"매");
		System.out.println("오십원 "+e_count+"매");
		System.out.println("십원 "+f_count+"매");
		System.out.println("일원 "+g_count+"매");
		
		scanner.close();
	}
}
