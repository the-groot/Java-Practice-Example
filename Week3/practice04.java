package Week3;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alp[]= {'a','b','c','d','e','f','g','h','i',
				'j','k','l','m','n','o','p','q','r',
				's','t','u','v','w','x','y','z'};
		Scanner sc=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오");
		String s=sc.next();
		char c=s.charAt(0);
		int order=c-'a';
		
		for(int i=order; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print(alp[j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
