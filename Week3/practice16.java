package Week3;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String command;
		int random;
		String str[]= {"����","����","��"};
		
		while(true){
			System.out.print("���� ���� ��!>>");
			command=sc.next();
			random=(int)(Math.random()*3);
			
			if(command.equals("�׸�")) {				//�׸� �Է�������
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			
			
			else {		//�׸� �Է¾�������
				if(!(command.equals("����")) && !(command.equals("����")) && !(command.equals("��"))){
					//���� ���� �� ���� �ٸ� ���ڸ� �Է������� continue
					System.out.println("���� ���� �� �� �ϳ��� �ٽ� �Է��Ͻÿ�.");
					continue;
				}
			
			if(str[random].equals("����")) {		//�� �ܿ��� ����, ����, ���� �Է������Ƿ� ��ǻ�Ϳ� �� �� ��� ���
				if(command.equals("����")) 
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				else if(command.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �����ϴ�.");
				else
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
			}
			
			else if(str[random].equals("����")) {
				if(command.equals("����")) 
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				else if(command.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				else
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �����ϴ�.");
			}
			
			else if(str[random].equals("��"))	{
				if(command.equals("����")) 
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �����ϴ�.");
				else if(command.equals("����"))
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				else
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
			}
			
			
		}
		}
		sc.close();
	}

}
