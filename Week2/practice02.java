package Week2;
import java.util.Scanner;

public class practice02 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)");
		int num=scanner.nextInt();
		int first, tenth;
		first=num%10;
		tenth=num/10;
		
		if(first==tenth) {
			System.out.println("Yes! 10�� �ڸ��� 1���ڸ��� �����ϴ�.");
		}
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		scanner.close();
	}
}
