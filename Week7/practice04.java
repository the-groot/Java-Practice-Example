package Week7;

import java.util.*;

public class practice04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int user_input;
		int sum=0;
		Vector<Integer> raindrop=new Vector<>();
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			user_input=sc.nextInt();
			if(user_input==0)
				break;
			raindrop.add(user_input);
			
			for(int i=0; i<raindrop.size(); i++) {
				System.out.print(raindrop.get(i)+" ");
			}
			System.out.println();
			sum+=user_input;
			System.out.println("���� ��� "+sum/raindrop.size());
		}
		sc.close();
	}
}
