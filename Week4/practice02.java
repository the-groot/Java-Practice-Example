package Week4;

import java.util.Scanner;

public class practice02 {
	int math;
	int science;
	int english;
	int average;
	
	public practice02(int math, int science, int english){
		this.math=math;
		this.science=science;
		this.english=english;
	}
	
	protected int average() {
		return ((math+science+english)/3);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math=sc.nextInt();
		int science=sc.nextInt();
		int english=sc.nextInt();
		
		practice02 me=new practice02(math,science,english);
		System.out.println("평균은 "+me.average());
		sc.close();
	}
	

}
