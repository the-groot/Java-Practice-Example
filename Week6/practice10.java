package Week6;

import java.util.Scanner;

class Person{
	Scanner sc=new Scanner(System.in);
	private String name;
	private String buffer;
	private double a,b,c;
	public Person(String name) {
		this.name=name;
	}
	
	protected boolean enter() {
		System.out.print("["+name+"]:<Enter>");
		buffer=sc.nextLine();
		a=((int)(Math.random()*10))%3+1;
		b=((int)Math.random()*10)%3+1;
		c=((int)Math.random()*10)%3+1;
		
		System.out.print(a+"   "+b+"   "+c+"  ");
		if(a==b&& b==c)
			return true;
		else
			return false;
	}
}

public class practice10 {
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			String name1,name2;
			System.out.print("1��° ���� �̸�>>");
			name1=sc.next();
			System.out.print("2��° ���� �̸�>>");
			name2=sc.next();
			boolean result;
			Person p1=new Person(name1);
			Person p2=new Person(name2);
			
			
			while(true) {
			result=p1.enter();
			if(result==true) {
				System.out.println(name1+"���� �̰���ϴ�!");
				break;
			}
			else {
				System.out.println("�ƽ�����!");
			}
			result=p2.enter();
			if(result==true) {
				System.out.println(name2+"���� �̰���ϴ�!");
				break;
			}
			else {
				System.out.println("�ƽ�����!");
			}
			
			}	
			
			sc.close();
	}
}
