package Week7;

import java.util.*;

public class practice02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String skrr;
		double sum=0.0;
		ArrayList<String> score=new ArrayList<>();
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i=0; i<6; i++)
			score.add(sc.next());
		
		for(int i=0; i<6; i++)
		{
			skrr=score.get(i);
			if(skrr.equals("A")) {
				sum+=4.0;
			}
			else if(skrr.equals("B")) {
				sum+=3.0;
			}
			else if(skrr.equals("C")) {
				sum+=2.0;
			}
			else if(skrr.equals("D")) {
				sum+=1.0;
			}
			else if(skrr.equals("F")) {
				sum+=0.0;
			}
			
		}
		System.out.println(sum/6.0);
		sc.close();
	}
}
