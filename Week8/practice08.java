package Week8;

import java.io.*;

public class practice08 {
	
	public static void BiggestFile(File src) {
		System.out.print("가장 큰 파일은 ");
		long max=0;
		String maxfilename=null;
		File[] subFiles=src.listFiles();
		
		for(int i=0; i<subFiles.length; i++) {
			File f=subFiles[i];
			
			if(max<f.length()) {
				max=f.length();
				maxfilename=f.getName();
			}
		}
		
		System.out.println(maxfilename+" "+max);
	}
	
	public static void main(String[] args) {
		File src=new File("C:\\");
		BiggestFile(src);
	}
}
