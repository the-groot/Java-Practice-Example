package Week5;
//https://security-nanglam.tistory.com/218 �ڵ� ������

import java.util.Scanner;

abstract class Shape3{
	private Shape3 next;
	public Shape3() {next=null;}
	public void setNext(Shape3 obj) {next=obj;}
	public Shape3 getNext() {return next;}
	public abstract void draw();
}

class Line3 extends Shape3 {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect3 extends Shape3 {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle3 extends Shape3 {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class practice12 {
	private Shape3 head,tail;
	private Scanner sc;
	public practice12() {
		head=null;
		tail=null;
		sc=new Scanner(System.in);
	}
	
	public void run() {
		int command=0;
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(command!=4) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			command=sc.nextInt();
			
			switch(command) {
			case 1:{
				Insert();
				break;
			}
			case 2:{
				Delete();
				break;
			}
			case 3:{
				Print();
				break;
			}
			default:
			System.out.println("beauty�� �����մϴ�.");
			}
		}
	}
	
	
	public void Insert() {
		Shape3 graphic;
		int num;
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		num=sc.nextInt();
		
		switch(num) {
		case 1:{
			graphic=new Line3();
			break;
		}
		case 2:{
			graphic=new Rect3();
			break;
		}
		case 3:{
			graphic=new Circle3();
			break;
		}
		default:{
			System.out.println("1~3�߿� �������ּ���.");
			return;
		}		
		
		}
		if(head==null) {
			head=graphic;
			tail=graphic;
		}
		else {
			tail.setNext(graphic);
			tail=graphic;
		}
	}
	
	public void Delete() {
		Shape3 tmp=head;
		Shape3 cur=head;
		int i;
		int num;
		System.out.print("������ ������ ��ġ>>");
		num=sc.nextInt();
		
		if(num==1) {	//ù��° ��带 �����Ҷ�
			if(head==tail) {	//��尡 �Ѱ��϶�
			head=null;
			tail=null;
			return;
		}
		else {
			head=head.getNext();
			return;
		}
		}
		for(i=1; i<num; i++) {
			tmp=cur;
			cur=cur.getNext();
			if(cur==null) {
				System.out.println("������ �� �����ϴ�.");
				return;
			}
		}
		if(i==num) {	//�� ��带 ����ų��
			tmp.setNext(cur.getNext());	//������ ������
			tail=tmp;
		}
		else
			tmp.setNext(cur.getNext());	//���������
	}
	
	public void Print() {
		Shape3 search=head;
		
		while(search!=null) {
			search.draw();
			search=search.getNext();
		}
		
	}

	public static void main(String args[]) {
		practice12 e=new practice12();
		e.run();
	}
}
