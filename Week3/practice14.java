package Week3;

import java.util.Scanner;

public class practice14 {
	public static void main(String args[]) {
		String course [] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		Scanner sc=new Scanner(System.in);
		String command;
		while(true) {
			int subject_check=0;	//���� ���翩�� üũ�ϴ� ����
			System.out.print("���� �̸�>>");
			command=sc.next();
			if(command.equals("�׸�")) {	//�׸� �Է¹����� Ż��
				break;
			}
			
			for(int i=0; i<course.length; i++) {
			if(course[i].equals(command)) {
				System.out.println(course[i]+"�� ������ "+score[i]);
				subject_check=1;	
			}
			}
			if(subject_check!=1)		//�ݺ��� �� ���Ҵµ� ������ �������� ������ ���°��� ���� ��� 
				System.out.println("���� �����Դϴ�.");
				
			
		}
		sc.close();
	}
}
