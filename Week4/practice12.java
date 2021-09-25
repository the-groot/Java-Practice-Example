package Week4;

import java.util.Scanner;

class Concert{
	private static int S,A,B;
	private static String S_Seatname[]=new String[11];
	private static String A_Seatname[]=new String[11];
	private static String B_Seatname[]=new String[11];
	
	protected static void setseatS(int num,String name) {
		if(!isStringEmpty(S_Seatname[num])) {	//�̹� ����� �¼��϶���
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return;			//�������� �ʴ´�.
		}
		S_Seatname[num]=name;
	}
	protected static void setseatA(int num,String name) {
		if(!isStringEmpty(A_Seatname[num])) {	//�̹� ����� �¼��϶���
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return;			//�������� �ʴ´�.
		}
		
		A_Seatname[num]=name;
	}
	protected static void setseatB(int num,String name) {
		if(!isStringEmpty(B_Seatname[num])) {	//�̹� ����� �¼��϶���
			System.out.println("�̹� ����� �¼��Դϴ�.");
			return;			//�������� �ʴ´�.
		}
		B_Seatname[num]=name;
		
	}
	
	protected static boolean removeseatS(String name) {	//�¼� ����ϴ� �޼ҵ�
		for(int i=1; i<S_Seatname.length; i++) {
			if(name.equals(S_Seatname[i])) {	//S_Seatname�� name�� ������
				S_Seatname[i]=null;	//null�� �����
				return true;	//��ҿϷ��ߴٴ� �ǹ̷� true����
			}
			
		}
		return false;	//name�� ������ false����
	}
	protected static boolean removeseatA(String name) {
		for(int i=1; i<A_Seatname.length; i++) {
			if(name.equals(A_Seatname[i])) {	//A_Seatname�� name�� ������
				A_Seatname[i]=null;	//null�� �����
				return true;	//��ҿϷ��ߴٴ� �ǹ̷� true����
			}
			
		}
		return false;	//name�� ������ false����
		
	}
	protected static boolean removeseatB(String name) {
		for(int i=1; i<B_Seatname.length; i++) {
			if(name.equals(B_Seatname[i])) {	//B_Seatname�� name�� ������
				B_Seatname[i]=null;	//null�� �����
				return true;	//��ҿϷ��ߴٴ� �ǹ̷� true����
			}
			
		}
		return false;	//name�� ������ false����
	
	}
	
	
	static boolean isStringEmpty(String str) {	//String�� null���� üũ�ϴ� �Լ�
		return str==null||str.isEmpty();
	}
	
	public static void show_seatS() {
		System.out.print("S>>");
		for(int i=1; i<S_Seatname.length; i++) {	//S_Seatname �迭�� ���鼭
			if(isStringEmpty(S_Seatname[i]))	//null�̸� �����̾ȵȰ��̹Ƿ�
				System.out.print(" ---");		//����ٴ�ǥ�� ���
			else
				System.out.print(" "+S_Seatname[i]);	//null�̾ƴϸ� ����Ȼ�Ȳ�̹Ƿ� �̸� ���
		}
	}
	public static void show_seatA() {
		System.out.print("A>>");
		for(int i=1; i<A_Seatname.length; i++) {	//S_Seatname �迭�� ���鼭
			if(isStringEmpty(A_Seatname[i]))	//null�̸� �����̾ȵȰ��̹Ƿ�
				System.out.print(" ---");		//����ٴ�ǥ�� ���
			else
				System.out.print(" "+A_Seatname[i]);	//null�̾ƴϸ� ����Ȼ�Ȳ�̹Ƿ� �̸� ���
		}
		
	}
	public static void show_seatB() {
		System.out.print("B>>");
		for(int i=1; i<B_Seatname.length; i++) {	//S_Seatname �迭�� ���鼭
			if(isStringEmpty(B_Seatname[i]))	//null�̸� �����̾ȵȰ��̹Ƿ�
				System.out.print(" ---");		//����ٴ�ǥ�� ���
			else
				System.out.print(" "+B_Seatname[i]);	//null�̾ƴϸ� ����Ȼ�Ȳ�̹Ƿ� �̸� ���
		}
		
	}
	
}

public class practice12 {

	public static void main(String[] args) {
		boolean keyword=true;
		int command;	//����� ���� �޴�����
		int seatno;	//�¼���ȣ(S,A,B)
		String name;	//���� �̸�
		int number;		//���� ��ȣ
		boolean remove_result=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(keyword) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			command=sc.nextInt();
			
			switch(command) {
			case 1:		//����������
			{	System.out.print("�¼����� S(1) A(2) B(3)>>");
				seatno=sc.nextInt();	//1,2,3���ϳ��� �޴´�
				System.out.println("1~10���� �¼��� �������ּ���");
				switch(seatno) {
				case 1:{	//S(1)�� ����������
					Concert.show_seatS();	//S�¼���Ȳ �����ְ�
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					System.out.print("��ȣ>>");
					number=sc.nextInt();			//�̸� �� ��ȣ �Է¹޾�
					try {			
					Concert.setseatS(number, name);		//�¼����� �����ϴµ�
					}
					catch (Exception e) {		//1~10���� �����Ƿ� �迭�� �ε����� ����� �κп� ����ó���Ѵ�
						System.out.println("1~10�� �Է����ּ���");
					}
					break;
				}
				case 2:{
					Concert.show_seatA();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					System.out.print("��ȣ>>");
					number=sc.nextInt();
					
					try {
					Concert.setseatA(number, name);
					}
					catch(Exception e) {
						System.out.println("1~10�� �Է����ּ���");
					}
					break;
				}
				case 3:{
					Concert.show_seatB();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					System.out.print("��ȣ>>");
					number=sc.nextInt();
					
					try {
					Concert.setseatB(number, name);
					}
					catch (Exception e){
						System.out.println("1~10�� �Է����ּ���");
					}
					break;
				}
				default:		//S,A,B(1~3)�� �������������� ����� ���
				System.out.println("1~3���� �������ּ���.");
				break;
				}
				
				break;
			}
			case 2:{	//��ȸ
				Concert.show_seatS();
				System.out.println();
				Concert.show_seatA();
				System.out.println();
				Concert.show_seatB();
				System.out.println();
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�>>>");
				break;
			}
			case 3:{	//���
				System.out.print("�¼� S:1, A:2, B:3>>");
				seatno=sc.nextInt();
				
				switch(seatno) {
				case 1:{
					Concert.show_seatS();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					remove_result=Concert.removeseatS(name);
					
					if(remove_result) {
						System.out.println("��� �Ϸ��߽��ϴ�.");
					}
					else
						System.out.println("���������� �����ϴ�.");
					
					break;
				}
				case 2:{
					Concert.show_seatA();
					System.out.println();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					remove_result=Concert.removeseatA(name);
					
					if(remove_result) {
						System.out.println("��� �Ϸ��߽��ϴ�.");
					}
					else
						System.out.println("���������� �����ϴ�.");
					
					break;
				}
				case 3: {
					Concert.show_seatB();
					System.out.println();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					remove_result=Concert.removeseatB(name);
					
					if(remove_result) {
						System.out.println("��� �Ϸ��߽��ϴ�.");
					}
					else
						System.out.println("���������� �����ϴ�.");
					
					break;
				}
				default:
					System.out.println("1~3�� �����ÿ�.");
				
				}
				
				break;
				
			}
			case 4: {	//������
				System.out.println("���α׷��� �����մϴ�.");
				keyword=false;
				break;
			}
			default:
			System.out.println("1~4���� �������ּ���.");
			break;
			}
		}
		sc.close();
	}

}
