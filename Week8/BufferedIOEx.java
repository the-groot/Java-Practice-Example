package Week8;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin=null;
		int c;
		try {
			fin=new FileReader("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-7.txt");
			//fin�� ������ �д� ����
			BufferedOutputStream out=new BufferedOutputStream(System.out,5);
			//out�� ����Ʈ������ ���̳ʸ� �����͸� ó���ϴ� ���� ��Ʈ��
			while((c=fin.read())!=-1) {
				out.write(c);	//���۰� ���������� ȭ�鿡 ���
			}
			new Scanner(System.in).nextLine();	//enterŰ ��ٸ�
			out.flush();	//���ۿ� �����ִ� ���� ��� ���
			fin.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
