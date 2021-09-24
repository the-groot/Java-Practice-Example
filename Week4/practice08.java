package Week4;

import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	Phone(String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	
}

public class practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String command;
		int n;
		System.out.print("인원수>>");
		n=sc.nextInt();
		Phone p[]=new Phone[n];
		
		for(int i=0; i<p.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)");
			String name=sc.next();
			String tel=sc.next();
			p[i]=new Phone(name,tel);
		}	
		System.out.println("저장되었습니다...");
		
		while(true) {
			int check=0;
			
			System.out.print("검색할 이름>>");
			command=sc.next();
			
			if(command.equals("그만")) {
				break;
			}
			
			for(int i=0; i<p.length; i++) {
				if(command.equals(p[i].name)) {
					System.out.println(p[i].name+"의 번호는 "+p[i].tel+" 입니다.");
					check=1;
				}
			}
			if(check==0)
				System.out.println(command+"이 없습니다.");
		}
		sc.close();	
	}
}
