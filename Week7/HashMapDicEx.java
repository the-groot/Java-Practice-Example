package Week7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> dic=new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng=sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�...");
				break;
			}
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"�� ���� �ܾ� �Դϴ�.");
			else
				System.out.println(kor);
		}
		sc.close();
	}

}
