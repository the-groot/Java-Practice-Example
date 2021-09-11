package two_weeks;
import java.util.Scanner;
public class practice04 {
public static void main(String args[]) {
	int a,b,c;
	int middle;
	System.out.println("정수 3개 입력");
	Scanner scanner=new Scanner(System.in);
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=scanner.nextInt();
	
	if(a<b && a<c) {
		if(b<c) 
		middle=b;
		else
		middle=c;
	}
	else if(b<a && b<c) {
		if(a<c)
		middle=a;
		else
		middle=c;
	}
	else {
		if(a<b)
		middle=a;
		else
		middle=b;
	}
	System.out.println("중간 값은 "+middle+" 이다");
	scanner.close();
}	

}
