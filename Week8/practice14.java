package Week8;

import java.util.*;
import java.io.*;

public class practice14 {
	
	public static void FileSearch() {
		String src="C:\\";
		String path;
		
		Scanner sc=new Scanner(System.in);
		File current=null;		//현재있는 위치
		File[] subfiles=null;	//현재위치의 파일들
		current=new File(src);		//경로할당
		subfiles=current.listFiles();	//파일리스트할당
		
		
		while(true) {	
			
		for(File one : subfiles) {	//파일하나씩받아서
										//정보출력
			if(one.isDirectory()) {		//디렉토리면
				System.out.print("dir\t");
			}
			else if(one.isFile()) {
				System.out.print("file\t");
			}
			
			System.out.println(one.length()+"바이트\t"+one.getName());
			
			}
		System.out.print(">>");
		path=sc.next();
		String array[]=path.split(" ");
		
		if(path.equals("..")) {
			String s=current.getParent();
			
			if(s==null) {		//	부모노드가 없으면
								//루트노드이므로 이동할수없음
				System.out.println("이동할수없습니다.");
				continue;	//src변경없음
			}
			else {
				current=new File(current.getParent());		//경로할당
				subfiles=current.listFiles();	//파일리스트할당
			}
		}
		else if(path.equals("그만"))
			break;
		else {
			if(array.length==1) {	//length가 하나일때
			
			current=new File(src);		//경로할당
			subfiles=current.listFiles();	//파일리스트할당
			}
			else if(array.length==2) {
				if(array[0].equals("mkdir")) {	//mkdir이 입력되면
					File newDir=new File(current,array[1]);
					
					if(newDir.exists())
					System.out.println("이미 존재하는 파일이나 디렉터리 이름입니다.");
					
					else {
						System.out.println(array[1]+" 디렉터리를 생성하였습니다.");
						newDir.mkdir();
					}
				}
				
				else if(array[0].equals("rename")) {
					System.out.println("두개의 파일명이 주어지지않았습니다!");
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
