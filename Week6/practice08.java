package Week6;

import java.util.Scanner;

public class practice08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		str=sc.nextLine();
		
		for(int i=1; i<str.length(); i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0, i));
		}
		sc.close();
	}
}
