package Week6;

import java.util.Calendar;
import java.util.Scanner;

class game{
	Scanner sc=new Scanner(System.in);
	Calendar now=Calendar.getInstance();
	private int start, end;
	private String name;
	private String buffer;
	public game(String name){
		this.name=name;
	}
	
	protected int start() {
		System.out.println(name+"시작<Enter>키 >>");
		start=enter();
		System.out.println("10초 예상 후 <Enter>키 >>");
		end=enter();
		if(start<end)
			return end-start;
		else
			return (60-start)+end;
	}
	
	protected int enter() {
		buffer=sc.nextLine();
		now=Calendar.getInstance();
		System.out.println("\t현재 초 시간= "+now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
}


public class practice06{
	public static void main(String [] args) {
		game one=new game("임상우");
		game two=new game("김성호");
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1=one.start();
		int result2=two.start();
		
		if(Math.abs(result1-10)<Math.abs(result2-10))
			System.out.println("임상우의 결과"+result1+"김성호의 결과"+result2+"승자는 임상우");
		else
			System.out.println("임상우의 결과"+result1+"김성호의 결과"+result2+"승자는 김성호");
	}		
}