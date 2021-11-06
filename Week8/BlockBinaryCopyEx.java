package Week8;

import java.io.*;

public class BlockBinaryCopyEx {
	public static void main(String[] args) {
		File src=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\ani.png");
		File dest=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\copyani2.png");
		
		try {
			FileInputStream fi=new FileInputStream(src);
			FileOutputStream fo=new FileOutputStream(dest);
			byte [] buf=new byte[1024*10];	//10KB 버퍼
			
			while(true) {
				int n=fi.read(buf);
				fo.write(buf,0,n);
				if(n<buf.length) {
					break;
				}
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"를"+dest.getPath()+"로 복사하였습니다.");
		} catch(IOException e) {System.out.println("파일 복사 오류");}
	}
}
