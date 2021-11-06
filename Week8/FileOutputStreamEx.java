package Week8;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[]= {7,51,3,4,-1,24};
		try {
			FileOutputStream fout2=new FileOutputStream("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-4.txt");
		
		for(int i=0; i<b.length; i++)
			fout2.write(b[i]);
		fout2.close();
		
	} catch(IOException e) {
		System.out.println("경로의 파일에 저장할 수 없었습니다. 경로명을 확인해 주세요");
		return;
	}
	System.out.println("경로명에 저장하였습니다.");
}

}