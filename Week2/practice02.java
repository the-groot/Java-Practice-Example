package Week2;
import java.util.Scanner;

public class practice02 {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)");
		int num=scanner.nextInt();
		int first, tenth;
		first=num%10;
		tenth=num/10;
		
		if(first==tenth) {
			System.out.println("Yes! 10의 자리와 1의자리가 같습니다.");
		}
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		scanner.close();
	}
}
