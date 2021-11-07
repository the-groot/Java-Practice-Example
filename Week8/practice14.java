package Week8;

import java.util.*;
import java.io.*;

public class practice14 {
	
	String path="C:\\";	//��θ�����
	File current;	//���� ��ġ�� ������ ���� ��ü
	File[] subFiles;	//������ �ϳ��� ��������
	String user_input;
	String[] key=new String[3];
	Scanner sc=new Scanner(System.in);
	

	void setFiles() {
		current=new File(path);
		subFiles=current.listFiles();
	}
	
	void run() {
		
		System.out.println("["+current.getAbsolutePath()+"]");	//���������
		
		for(File f : subFiles) {
			if(f.isDirectory())		//���͸���
			System.out.print("dir");	//dir���
			else if(f.isFile())	//�����̸�
			System.out.print("\tfile");	//�������
			System.out.print("\t"+f.length()+"����Ʈ");
			System.out.print("\t"+f.getName());
			System.out.println();
		}
		
		System.out.print(">>");
		
		user_input=sc.nextLine();	//��ɾ� �Է¹���
		
		key=user_input.split(" ");	//��ɾ ���⸦ �������� ������
		if(key.length==1) {	//��ɾ �Ѱ���� path �����̳� ���α׷������̹Ƿ�
			setPath();	//setpathȣ��
		}
		else {		//��ɾ� �ΰ��̻��̸�
			setCommand();	// setcommandȣ��
		}
		
	}
	
	void setPath()
	{	
		 if(key[0].equals("�׸�")) {		//�׸��̸� ����
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		
		String checkpath=path;		//��θ������ϴ���Ȯ���ϴ� ��θ���
		checkpath=checkpath+"\\"+key[0];
		File check=new File(checkpath);		//��θ��� �����ϴ���Ȯ��
		System.out.println(path);
		if(check.exists()==false) {	//��������������
			System.out.println("��θ��� �������� �ʽ��ϴ�.");
			run();
		}
		
		if(key[0].equals("..")) {		//..�� �Է�������
			
			if(current.getParent()==null) {	//���� ��ΰ� ��Ʈ����϶���
				System.out.println("���� ��Ʈ����̹Ƿ� �̵��� �� �����ϴ�");
				run();
			}
			
			else {	
				path=current.getParent();	//path �θ�� ����
				setFiles();		//file�ٽü��� ��
				run();		//��
			}
			
		}
		
		
		else {		//�������� �������
		path=path+"\\"+key[0];		//��θ� �缳��
		setFiles();
		run();		//�ٽ� run ȣ��
		}
	}
	
	void setCommand() {
		
		if(key.length==2) {		//��ɾ �ΰ��϶�
			if(key[0].equals("mkdir")) {	//��ɾ mkdir�϶�
				File newdir=new File(current,key[1]);
				
				if(newdir.exists()) {	//�̹������ϸ�
					System.out.println("�̹� �����ϴ� ���͸��Դϴ�.");
				}
				else {
					System.out.println(key[1]+"���͸��� �����Ͽ����ϴ�.");
					newdir.mkdir();
				}
			}
			else if(key[0].equals("rename")) {
				System.out.println("�ΰ��� ���ϸ��� �־����� �ʾҽ��ϴ�.");
			}
			
			setFiles();
			run();
			
		}
		else if(key.length==3) {
			File srcfile=new File(current,key[1]);
			File newfile=new File(current,key[2]);
			
			if(srcfile.exists()) {	//�ٲ����ϸ��������ϰ�
				if(newfile.exists()) {	//���ӰԹٲ��̸��� ���ϸ��������ϸ�
					System.out.println("�̹�"+key[2]+"������ �����մϵ�");
				}	//�������� ���
				
				else {	//�ٲ���
					srcfile.renameTo(newfile);	//���Ϻ���
					System.out.println(key[1]+"�� "+key[2]+" �̸� �����Ͽ����ϴ�. ");
				}
			}
			else {
				System.out.println("������ ���������ʽ��ϴ�.");
			}
			
			setFiles();
			run();
		}
		
		
	}
	
	public static void main(String[] args) {
		practice14 p=new practice14();
		System.out.println("***** ���� Ž�����Դϴ�. *****");
		p.setFiles();
		p.run();
	}
}
