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
			System.out.println("경로명에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++) System.out.println(b[i]+" ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("경로명에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}
