package Week4;

import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	Phone(String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	
}

public class practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String command;
		int n;
		System.out.print("�ο���>>");
		n=sc.nextInt();
		Phone p[]=new Phone[n];
		
		for(int i=0; i<p.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)");
			String name=sc.next();
			String tel=sc.next();
			p[i]=new Phone(name,tel);
		}	
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			int check=0;
			
			System.out.print("�˻��� �̸�>>");
			command=sc.next();
			
			if(command.equals("�׸�")) {
				break;
			}
			
			for(int i=0; i<p.length; i++) {
				if(command.equals(p[i].name)) {
					System.out.println(p[i].name+"�� ��ȣ�� "+p[i].tel+" �Դϴ�.");
					check=1;
				}
			}
			if(check==0)
				System.out.println(command+"�� �����ϴ�.");
		}
		sc.close();	
	}
}
