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
		System.out.println(name+"����<Enter>Ű >>");
		start=enter();
		System.out.println("10�� ���� �� <Enter>Ű >>");
		end=enter();
		if(start<end)
			return end-start;
		else
			return (60-start)+end;
	}
	
	protected int enter() {
		buffer=sc.nextLine();
		now=Calendar.getInstance();
		System.out.println("\t���� �� �ð�= "+now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}
}


public class practice06{
	public static void main(String [] args) {
		game one=new game("�ӻ��");
		game two=new game("�輺ȣ");
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1=one.start();
		int result2=two.start();
		
		if(Math.abs(result1-10)<Math.abs(result2-10))
			System.out.println("�ӻ���� ���"+result1+"�輺ȣ�� ���"+result2+"���ڴ� �ӻ��");
		else
			System.out.println("�ӻ���� ���"+result1+"�輺ȣ�� ���"+result2+"���ڴ� �輺ȣ");
	}		
}