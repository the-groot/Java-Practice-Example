package Week7;

import java.util.*;

abstract class Shape{
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class practice10 {
	public static void main(String[] args) {
		Vector<Shape> graphic=new Vector<>();
		Shape shape=null;
		int command;
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		
		
		while(b) {
		System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>");
		command=sc.nextInt();
		switch(command) {
		case 1:{
			int insert_command;
			System.out.print("Line(1), Rect(2), Circle(3)>>");
			insert_command=sc.nextInt();
			switch(insert_command) {
			case 1:{
				shape=new Line();
				graphic.add(shape);
				break;
			}
			case 2:{
				shape=new Rect();
				graphic.add(shape);
				break;
			}
			case 3:{
				shape=new Circle();
				graphic.add(shape);
				break;
			}
			}
			break;
		}
		case 2:{
			int location;
			System.out.print("������ ������ ��ġ>>");
			location=sc.nextInt();
			if(graphic.size() == 0 || graphic.size() <= location-1)
				System.out.println("������ �� �����ϴ�.");
			else 
				graphic.remove(location-1);
			break;
		}
		case 3:{
			for(int i=0; i<graphic.size(); i++) {
				graphic.get(i).draw();
			}
			break;
		}
		case 4:{
			System.out.println("�ý��� ����");
		b=false;	
		}
		}
		}
		sc.close();
	}
}
