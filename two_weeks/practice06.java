package two_weeks;

import java.util.Scanner;

public class practice06 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int num,game_count=0;
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�");
		num=sc.nextInt();
		
		if(num>=10) {
			if((num/10)%3==0) {	//�����ڸ��� 3�ǹ������ üũ
				game_count++;
			}
			if((num%10)%3==0) {	//�����ڸ��� 3�ǹ������ üũ
				if(num%10==0) {		//num�� 10�ǹ���̸� num%10%3�� 0�ε� 3�ǹ���� �ƴϹǷ� �̸��ϳ����ش�
 					game_count--;
				}
				game_count++;
			}
		}
	
	else {
		if((num%10)%3==0) {		//�����ڸ��� 3�ǹ������ üũ
			game_count++;
		}
	}
		
		
		switch(game_count) {
		case 2: {
			System.out.println("�ڼ�¦¦");
			break;
		}
		case 1: {
			System.out.println("�ڼ�¦");
			break;
		}
		}

	}
}