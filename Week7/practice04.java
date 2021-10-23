package Week7;

import java.util.*;

public class practice04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int user_input;
		int sum=0;
		Vector<Integer> raindrop=new Vector<>();
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>>");
			user_input=sc.nextInt();
			if(user_input==0)
				break;
			raindrop.add(user_input);
			
			for(int i=0; i<raindrop.size(); i++) {
				System.out.print(raindrop.get(i)+" ");
			}
			System.out.println();
			sum+=user_input;
			System.out.println("현재 평균 "+sum/raindrop.size());
		}
		sc.close();
	}
}
