package Week8;

import java.io.*;
import java.util.*;

public class practice06 {
	public static void main(String[] args) {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		Scanner sc=new Scanner(System.in);
		String file1, file2, rootpath1, rootpath2, rootpath3;
		File file=new File("");
		String rootpath=file.getAbsolutePath();
		rootpath=rootpath+"\\src\\Week8\\";
		System.out.println("���:"+rootpath);
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		file1=sc.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		file2=sc.next();
		rootpath1=rootpath+file1;
		rootpath2=rootpath+file2;
		rootpath3=rootpath+"appended.txt";
		
		System.out.println(rootpath1+"\n"+rootpath2);
		
		try {
			FileReader fr1=new FileReader(rootpath1);
			FileReader fr2=new FileReader(rootpath2);
			FileWriter fw=new FileWriter(rootpath3);
			int c;
			while((c=fr1.read())!=-1) {
				fw.write((char)c);
			}
			fr1.close();
			fw.write("\n");
			while((c=fr2.read())!=-1) {
				fw.write((char)c);
			}
			fw.close();
			fr2.close();
			
		} catch(IOException e) {
			System.out.println("����� ����");
		}
		
		
	}
}
