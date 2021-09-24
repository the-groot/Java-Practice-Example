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
		try {
		B_Seatname[num]=name;
		}
		catch(Exception	e) {
			System.out.println("1~10�� �Է����ּ���");
		}
	}
	
	static boolean isStringEmpty(String str) {	//String�� null���� üũ�ϴ� �Լ�
		return str==null||str.isEmpty();
	}
	
	public static void show_seatS() {
		for(int i=1; i<S_Seatname.length; i++) {	//S_Seatname �迭�� ���鼭
			if(isStringEmpty(S_Seatname[i]))	//null�̸� �����̾ȵȰ��̹Ƿ�
				System.out.print(" ---");		//����ٴ�ǥ�� ���
			else
				System.out.print(" "+S_Seatname[i]);	//null�̾ƴϸ� ����Ȼ�Ȳ�̹Ƿ� �̸� ���
		}
	}
	public static void show_seatA() {
		for(int i=0; i<A_Seatname.length; i++) {	//S_Seatname �迭�� ���鼭
			if(isStringEmpty(A_Seatname[i]))	//null�̸� �����̾ȵȰ��̹Ƿ�
				System.out.print(" ---");		//����ٴ�ǥ�� ���
			else
				System.out.print(" "+A_Seatname[i]);	//null�̾ƴϸ� ����Ȼ�Ȳ�̹Ƿ� �̸� ���
		}
		
	}
	public static void show_seatB() {
		for(int i=0; i<B_Seatname.length; i++) {	//S_Seatname �迭�� ���鼭
			if(isStringEmpty(B_Seatname[i]))	//null�̸� �����̾ȵȰ��̹Ƿ�
				System.out.print(" ---");		//����ٴ�ǥ�� ���
			else
				System.out.print(" "+B_Seatname[i]);	//null�̾ƴϸ� ����Ȼ�Ȳ�̹Ƿ� �̸� ���
		}
		
	}
	
}

public class practice12 {

	public static void main(String[] args) {
		int command;	//����� ���� �޴�����
		int seatno;	//�¼���ȣ(S,A,B)
		String name;	//���� �̸�
		int number;		//���� ��ȣ
		Scanner sc=new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			command=sc.nextInt();
			
			switch(command) {
			case 1:
			{	System.out.print("�¼����� S(1) A(2) B(3)>>");
				seatno=sc.nextInt();
				
				switch(seatno) {
				case 1:{
					Concert.show_seatS();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					System.out.print("��ȣ>>");
					number=sc.nextInt();
					
					Concert.setseatS(number, name);
					break;
				}
				case 2:{
					Concert.show_seatA();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					System.out.print("��ȣ>>");
					number=sc.nextInt();
					
					Concert.setseatA(number, name);
					break;
				}
				case 3:{
					Concert.show_seatB();
					System.out.println();
					System.out.print("�̸�>>");
					name=sc.next();
					System.out.print("��ȣ>>");
					number=sc.nextInt();
					
					Concert.setseatB(number, name);
					break;
				}
				default:
				System.out.println("1~3���� �������ּ���.");
				break;
				}
				
				break;
			}
			case 2:{
				Concert.show_seatS();
				Concert.show_seatA();
				Concert.show_seatB();
				break;
			}
			case 3:{
				
			}
			case 4: {
				
			}
			default:
			System.out.println("1~4���� �������ּ���.");
			break;
			}
		}

	}

}
