package Week2;

import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("����");
		int a,b,result;
		String c;
		a=sc.nextInt();
		c=sc.next();
		b=sc.nextInt();
		
		switch(c) {
		
		
		case "+":{
			result=a+b;
			System.out.println(result);
			break;
		}
		case "-":{
			result=a-b;
			System.out.println(result);
			break;
		}
		case "*":{
			result=a*b;
			System.out.println(result);
			break;
		}
		case "/":{
			if(b==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				break;
			}
			result=a/b;
			System.out.println(result);
			break;
		}
		
		}
		sc.close();
	}

}
