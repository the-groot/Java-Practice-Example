package Week8;

import java.io.*;

public class TextCopyEx {
	public static void main(String[] args) {
		File src=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-1.txt");	//���� ���� ��θ�
		File dest=new File(("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-9.txt"));	//���� ���� ��θ�
		int c;
		
		try {
			FileReader fr=new FileReader(src);
			FileWriter fw=new FileWriter(dest);
			
			while((c=fr.read())!=-1) {	//���� �ϳ� �а�
				fw.write((char)c); //���� �ϳ� ����
			}
			fr.close(); fw.close();
			System.out.println(src.getPath()+"�� "+dest.getPath()+"�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}