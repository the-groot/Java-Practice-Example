package Week4;

import java.util.Scanner;

class Dictionary{
	private static String[] kor= {"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng (String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return "false";
	}
}

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc=new Scanner(System.in);
		String command;
		String search_result;
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			command=sc.next();
			if(command.equals("�׸�")) {
				break;
			}
			
			search_result=Dictionary.kor2Eng(command);
			
			if(search_result.equals("false"))
				System.out.println(command+"�� ���� ������ �����ϴ�.");
			else
				System.out.println(command+"�� "+search_result);
			
		}
		sc.close();
	}

}
