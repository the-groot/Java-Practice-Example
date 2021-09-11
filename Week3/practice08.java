package Week3;

import java.util.HashSet;
import java.util.Scanner;

public class practice08 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> luckyNumbers = new HashSet<>();
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 몇개?");
		n=sc.nextInt();
	
	while(luckyNumbers.size() < n ){
	    luckyNumbers.add((int)(Math.random() * 100) + 1);
	}

	
	for(int luckyNum : luckyNumbers) {
		
		System.out.print(luckyNum+" ");
		count++;
		if(count%10==0) {
			System.out.println();
		}
	}
	sc.close();
	}
}
