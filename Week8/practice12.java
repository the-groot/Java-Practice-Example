package Week8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class practice12 {
	
	String path=System.getProperty("user.dir");
	String filename=null;
	String key=null;
	Scanner sc=new Scanner(System.in);
	FileReader fr;
	Vector<String> vector=new Vector<>();
	Vector<Integer> linenumber=new Vector<>();
	
	practice12() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		path=path+"\\src\\Week8\\";
		System.out.print("��� ���ϸ� �Է�>> ");
		filename=sc.nextLine();
		path=path+filename;		//path �ֽ�ȭ
		
		while(true) {
		
		System.out.print("�˻��� �ܾ ����>> ");
		key=sc.nextLine();
		if(key.equals("�׸�"))
			break;
		
		
		
		try{
			
			fr=new FileReader(path);	//���� ��ü ����
			Scanner sc2=new Scanner(fr);	//scanner�� ���پ��Է¹��� ����
			
			while(sc2.hasNext()) {
				String line=sc2.nextLine();
				vector.add(line);
			}
			sc2.close();
			
			for(int i=0; i<vector.size(); i++) {
				String line=vector.get(i);
				if(line.indexOf(key)!=-1)		//�˻��ϴ� Ű��������
					linenumber.add(i);	//���γѹ� �߰�
			}
			
			for(int i=0; i<linenumber.size(); i++) {
				int linenum=linenumber.get(i);
				String line=vector.get(linenum);
				System.out.println(linenum+":\t"+line);
			}
			
			linenumber.clear();
			vector.clear();
		
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		
		}
		sc.close();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new practice12();
		
	}
	
}


