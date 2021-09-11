package Week3;

import java.util.Scanner;

public class practice10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int arr[][]=new int[4][4];
		int zero_count=0;
		int random_i, random_j;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(int)(Math.random()*10+1);
			}//0~0.9999
		}
		
		while(zero_count!=6) {
			random_i=(int)(Math.random()*3);
			random_j=(int)(Math.random()*3);
			if(arr[random_i][random_j]==0) {	//이미 0인 경우에는 zero_count를 세지않는다
				continue;
			}
			arr[random_i][random_j]=0;
			zero_count++;
		}
		
		
		
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}
}
