package Week8;

import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[]=new byte[6];
		
		try {
			FileInputStream fin=new FileInputStream("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-4.txt");
			int n=0,c;
			while((c=fin.read())!=-1) {
				b[n]=(byte)c;
				n++;
			}
			System.out.println("��θ��� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++) System.out.println(b[i]+" ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("��θ��� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}
	}
}
