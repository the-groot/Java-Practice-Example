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
		B_Seatname[num]=name;
		
	}
	
	protected static boolean removeseatS(String name) {	//좌석 취소하는 메소드
		for(int i=1; i<S_Seatname.length; i++) {
			if(name.equals(S_Seatname[i])) {	//S_Seatname에 name이 있으면
				S_Seatname[i]=null;	//null로 지우고
				return true;	//취소완료했다는 의미로 true리턴
			}
			
		}
		return false;	//name이 없으면 false리턴
	}
	protected static boolean removeseatA(String name) {
		for(int i=1; i<A_Seatname.length; i++) {
			if(name.equals(A_Seatname[i])) {	//A_Seatname에 name이 있으면
				A_Seatname[i]=null;	//null로 지우고
				return true;	//취소완료했다는 의미로 true리턴
			}
			
		}
		return false;	//name이 없으면 false리턴
		
	}
	protected static boolean removeseatB(String name) {
		for(int i=1; i<B_Seatname.length; i++) {
			if(name.equals(B_Seatname[i])) {	//B_Seatname에 name이 있으면
				B_Seatname[i]=null;	//null로 지우고
				return true;	//취소완료했다는 의미로 true리턴
			}
			
		}
		return false;	//name이 없으면 false리턴
	
	}
	
	
	static boolean isStringEmpty(String str) {	//String이 null인지 체크하는 함수
		return str==null||str.isEmpty();
	}
	
	public static void show_seatS() {
		System.out.print("S>>");
		for(int i=1; i<S_Seatname.length; i++) {	//S_Seatname 배열을 돌면서
			if(isStringEmpty(S_Seatname[i]))	//null이면 예약이안된거이므로
				System.out.print(" ---");		//비었다는표시 출력
			else
				System.out.print(" "+S_Seatname[i]);	//null이아니면 예약된상황이므로 이름 출력
		}
	}
	public static void show_seatA() {
		System.out.print("A>>");
		for(int i=1; i<A_Seatname.length; i++) {	//S_Seatname 배열을 돌면서
			if(isStringEmpty(A_Seatname[i]))	//null이면 예약이안된거이므로
				System.out.print(" ---");		//비었다는표시 출력
			else
				System.out.print(" "+A_Seatname[i]);	//null이아니면 예약된상황이므로 이름 출력
		}
		
	}
	public static void show_seatB() {
		System.out.print("B>>");
		for(int i=1; i<B_Seatname.length; i++) {	//S_Seatname 배열을 돌면서
			if(isStringEmpty(B_Seatname[i]))	//null이면 예약이안된거이므로
				System.out.print(" ---");		//비었다는표시 출력
			else
				System.out.print(" "+B_Seatname[i]);	//null이아니면 예약된상황이므로 이름 출력
		}
		
	}
	
}

public class practice12 {

	public static void main(String[] args) {
		boolean keyword=true;
		int command;	//사용자 예약 메뉴선택
		int seatno;	//좌석번호(S,A,B)
		String name;	//예약 이름
		int number;		//예약 번호
		boolean remove_result=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(keyword) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			command=sc.nextInt();
			
			switch(command) {
			case 1:		//예약했을때
			{	System.out.print("좌석구분 S(1) A(2) B(3)>>");
				seatno=sc.nextInt();	//1,2,3중하나를 받는다
				System.out.println("1~10번의 좌석을 선택해주세요");
				switch(seatno) {
				case 1:{	//S(1)을 선택했을때
					Concert.show_seatS();	//S좌석현황 보여주고
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					System.out.print("번호>>");
					number=sc.nextInt();			//이름 및 번호 입력받아
					try {			
					Concert.setseatS(number, name);		//좌석정보 저장하는데
					}
					catch (Exception e) {		//1~10번만 있으므로 배열의 인덱스를 벗어나는 부분에 예외처리한다
						System.out.println("1~10을 입력해주세요");
					}
					break;
				}
				case 2:{
					Concert.show_seatA();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					System.out.print("번호>>");
					number=sc.nextInt();
					
					try {
					Concert.setseatA(number, name);
					}
					catch(Exception e) {
						System.out.println("1~10을 입력해주세요");
					}
					break;
				}
				case 3:{
					Concert.show_seatB();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					System.out.print("번호>>");
					number=sc.nextInt();
					
					try {
					Concert.setseatB(number, name);
					}
					catch (Exception e){
						System.out.println("1~10을 입력해주세요");
					}
					break;
				}
				default:		//S,A,B(1~3)을 선택하지않으면 경고문구 출력
				System.out.println("1~3번을 선택해주세요.");
				break;
				}
				
				break;
			}
			case 2:{	//조회
				Concert.show_seatS();
				System.out.println();
				Concert.show_seatA();
				System.out.println();
				Concert.show_seatB();
				System.out.println();
				System.out.println("<<<조회를 완료하였습니다>>>");
				break;
			}
			case 3:{	//취소
				System.out.print("좌석 S:1, A:2, B:3>>");
				seatno=sc.nextInt();
				
				switch(seatno) {
				case 1:{
					Concert.show_seatS();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					remove_result=Concert.removeseatS(name);
					
					if(remove_result) {
						System.out.println("취소 완료했습니다.");
					}
					else
						System.out.println("예약정보가 없습니다.");
					
					break;
				}
				case 2:{
					Concert.show_seatA();
					System.out.println();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					remove_result=Concert.removeseatA(name);
					
					if(remove_result) {
						System.out.println("취소 완료했습니다.");
					}
					else
						System.out.println("예약정보가 없습니다.");
					
					break;
				}
				case 3: {
					Concert.show_seatB();
					System.out.println();
					System.out.println();
					System.out.print("이름>>");
					name=sc.next();
					remove_result=Concert.removeseatB(name);
					
					if(remove_result) {
						System.out.println("취소 완료했습니다.");
					}
					else
						System.out.println("예약정보가 없습니다.");
					
					break;
				}
				default:
					System.out.println("1~3을 누르시오.");
				
				}
				
				break;
				
			}
			case 4: {	//끝내기
				System.out.println("프로그램을 종료합니다.");
				keyword=false;
				break;
			}
			default:
			System.out.println("1~4번을 선택해주세요.");
			break;
			}
		}
		sc.close();
	}

}
