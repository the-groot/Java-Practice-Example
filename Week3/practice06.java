package Week3;

import java.util.Scanner;

public class practice06 {
	public static void main(String args[]) {
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		int count[]= {0,0,0,0,0,0,0,0};
		Scanner sc=new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�");
		int cash;
		cash=sc.nextInt();
		
		while(cash!=0) {
			for(int i=0; i<unit.length; i++) {
				count[i]=cash/unit[i];
				cash=cash-count[i]*unit[i];
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]==0) 
			continue;
			System.out.print(unit[i]+"�� ¥�� : "+count[i]+"��");
			System.out.println();
		}
		sc.close();
	}

}
