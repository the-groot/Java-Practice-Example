package Week8;

import java.util.*;
import java.io.*;

public class practice14 {
	
	public static void FileSearch() {
		String src="C:\\";
		String path;
		
		Scanner sc=new Scanner(System.in);
		File current=null;		//�����ִ� ��ġ
		File[] subfiles=null;	//������ġ�� ���ϵ�
		current=new File(src);		//����Ҵ�
		subfiles=current.listFiles();	//���ϸ���Ʈ�Ҵ�
		
		
		while(true) {	
			
		for(File one : subfiles) {	//�����ϳ����޾Ƽ�
										//�������
			if(one.isDirectory()) {		//���丮��
				System.out.print("dir\t");
			}
			else if(one.isFile()) {
				System.out.print("file\t");
			}
			
			System.out.println(one.length()+"����Ʈ\t"+one.getName());
			
			}
		System.out.print(">>");
		path=sc.next();
		String array[]=path.split(" ");
		
		if(path.equals("..")) {
			String s=current.getParent();
			
			if(s==null) {		//	�θ��尡 ������
								//��Ʈ����̹Ƿ� �̵��Ҽ�����
				System.out.println("�̵��Ҽ������ϴ�.");
				continue;	//src�������
			}
			else {
				current=new File(current.getParent());		//����Ҵ�
				subfiles=current.listFiles();	//���ϸ���Ʈ�Ҵ�
			}
		}
		else if(path.equals("�׸�"))
			break;
		else {
			if(array.length==1) {	//length�� �ϳ��϶�
			
			current=new File(src);		//����Ҵ�
			subfiles=current.listFiles();	//���ϸ���Ʈ�Ҵ�
			}
			else if(array.length==2) {
				if(array[0].equals("mkdir")) {	//mkdir�� �ԷµǸ�
					File newDir=new File(current,array[1]);
					
					if(newDir.exists())
					System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�.");
					
					else {
						System.out.println(array[1]+" ���͸��� �����Ͽ����ϴ�.");
						newDir.mkdir();
					}
				}
				
				else if(array[0].equals("rename")) {
					System.out.println("�ΰ��� ���ϸ��� �־������ʾҽ��ϴ�!");
				}
			}
			else {
				
				
				
				
			}
		}
		src=src+path+"\\";
		System.out.println(src);
		}		
		
	}
	
	public static void main(String[] args) {
		FileSearch();
	}
}
