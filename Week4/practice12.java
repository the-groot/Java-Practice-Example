package Week4;

import java.util.Scanner;

class Concert{
	private static int S,A,B;
	private static String S_Seatname[]=new String[11];
	private static String A_Seatname[]=new String[11];
	private static String B_Seatname[]=new String[11];
	
	protected static void setseatS(int num,String name) {
		if(!isStringEmpty(S_Seatname[num])) {	//이미 예약된 좌석일때는
			System.out.println("이미 예약된 좌석입니다.");
			return;			//저장하지 않는다.
		}
		S_Seatname[num]=name;
	}
	protected static void setseatA(int num,String name) {
		if(!isStringEmpty(A_Seatname[num])) {	//이미 예약된 좌석일때는
			System.out.println("이미 예약된 좌석입니다.");
			return;			//저장하지 않는다.
		}
		
		A_Seatname[num]=name;
	}
	protected static void setseatB(int num,String name) {
		if(!isStringEmpty(B_Seatname[num])) {	//이미 예약된 좌석일때는
			System.out.println("이미 예약된 좌석입니다.");
			return;			//저장하지 않는다.
		}
		try {
		B_Seatname[num]=name;
		}
		catch(Exception	e) {
			System.out.println("1~10을 입력해주세요");
		}
	}
	
	static boolean isStringEmpty(String str) {	//String이 null인지 체크하는 함수
		return str==null||str.isEmpty();
	}
	
	public static void show_seatS() {
		for(int i=1; i<S_Seatname.length; i++) {	//S_Seatname 배열을 돌면서
			if(isStringEmpty(S_Seatname[i]))	//null이면 예약이안된거이므로
				System.out.print(" ---");		//비었다는표시 출력
			else
				System.out.print(" "+S_Seatname[i]);	//null이아니면 예약된상황이므로 이름 출력
		}
	}
	public static void show_seatA() {
		for(int i=0; i<A_Seatname.length; i++) {	//S_Seatname 배열을 돌면서
			if(isStringEmpty(A_Seatname[i]))	//null이면 예약이안된거이므로
				System.out.print(" ---");		//비었다는표시 출력
			else
				System.out.print(" "+A_Seatname[i]);	//null이아니면 예약된상황이므로 이름 출력
		}
		
	}
	public static void show_seatB() {
		for(int i=0; i<B_Seatname.length; i++) {	//S_Seatname 배열을 돌면서
			if(isStringEmpty(B_Seatname[i]))	//null이면 예약이안된거이므로
				System.out.print(" ---");		//비었다는표시 출력
			else
				System.out.print(" "+B_Seatname[i]);	//null이아니면 예약된상황이므로 이름 출력
		}
		
	}
	
}

public class practice12 {

	public static void main(String[] args) {
		int command;	//사용자 예약 메뉴선택
		int seatno;	//좌석번호(S,A,B)
		String name;	//예약 이름
		int number;		//예약 번호
		Scanner sc=new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			command=sc.nextInt();
			
			switch(command) {
			case 1:
			{	System.out.print("좌석구분 S(1) A(2) B(3)>>");
				seatno=sc.nextInt();
				
				switch(seatno) {
				case 1:{
					Concert.show_seatS();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					System.out.print("번호>>");
					number=sc.nextInt();
					
					Concert.setseatS(number, name);
					break;
				}
				case 2:{
					Concert.show_seatA();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					System.out.print("번호>>");
					number=sc.nextInt();
					
					Concert.setseatA(number, name);
					break;
				}
				case 3:{
					Concert.show_seatB();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					System.out.print("번호>>");
					number=sc.nextInt();
					
					Concert.setseatB(number, name);
					break;
				}
				default:
				System.out.println("1~3번을 선택해주세요.");
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
			System.out.println("1~4번을 선택해주세요.");
			break;
			}
		}

	}

}
