package Week8;

import java.io.*;
import java.util.*;

public class practice06 {
	public static void main(String[] args) {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		Scanner sc=new Scanner(System.in);
		String file1, file2, rootpath1, rootpath2, rootpath3;
		File file=new File("");
		String rootpath=file.getAbsolutePath();
		rootpath=rootpath+"\\src\\Week8\\";
		System.out.println("경로:"+rootpath);
		
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		file1=sc.next();
		System.out.print("두번째 파일 이름을 입력하세요>>");
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
			System.out.println("입출력 오류");
		}
		
		
	}
}
