package Week8;

import java.io.*;

public class FileReadHangulFail {
	public static void main(String[] args) {
		InputStreamReader in=null;
		FileInputStream fin=null;
		
		try {
			fin=new FileInputStream("D:\\Eclipse\\workspace\\test\\src\\Week8\\hangul.txt");
			in=new InputStreamReader(fin, "US-ASCII");
			int c;
			
			System.out.println("���ڵ� ���� ������ "+in.getEncoding());
			while((c=in.read())!=-1) {
				System.out.println((char)c);
			}
			in.close();
			fin.close();
		}catch (IOException e) {
			System.out.println("����� ����");
		} 
		}
	}

