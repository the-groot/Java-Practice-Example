package Week6;

import java.util.Scanner;

class Person2{
	Scanner sc=new Scanner(System.in);
	private int number;
	private String name[];
	private String buffer;
	private double a,b,c;
	
	
	protected boolean enter() {
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
	public void setnumber() {
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		number=sc.nextInt();
	}
	public void setperson() {
		name= new String[number];
		for(int i=0; i<number; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			name[i]=sc.next();
		}
	}
	
	public void remove_buffer() {
		sc.nextLine();
	}
	
	public String getname(int number) {
		return name[number];
	}
	public int getnumber() {
		return number;
	}
	
}

public class practice12 {
	public static void main(String[] args) {
			boolean result;
			Person2 p=new Person2();
			p.setnumber();
			p.setperson();	
			p.remove_buffer();
			
			while(true) {
				
				for(int i=0; i<p.getnumber(); i++) {
					System.out.print("["+p.getname(i)+"]:<Enter>");
					result=p.enter();
					
					if(result==true)
					{
						System.out.println(p.getname(i)+"님이 이겼습니다!");
					}
					else {
						System.out.println("아쉽군요!");
					}
					
				}
				
			}
			
	}
}
