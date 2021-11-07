package Week8;

import java.util.*;
import java.io.*;

public class practice14 {
	
	String path="C:\\";	//경로명저장
	File current;	//현재 위치의 파일을 받을 객체
	File[] subFiles;	//파일을 하나씩 받을버퍼
	String user_input;
	String[] key=new String[3];
	Scanner sc=new Scanner(System.in);
	

	void setFiles() {
		current=new File(path);
		subFiles=current.listFiles();
	}
	
	void run() {
		
		System.out.println("["+current.getAbsolutePath()+"]");	//현재경로출력
		
		for(File f : subFiles) {
			if(f.isDirectory())		//디렉터리면
			System.out.print("dir");	//dir출력
			else if(f.isFile())	//파일이면
			System.out.print("\tfile");	//파일출력
			System.out.print("\t"+f.length()+"바이트");
			System.out.print("\t"+f.getName());
			System.out.println();
		}
		
		System.out.print(">>");
		
		user_input=sc.nextLine();	//명령어 입력받음
		
		key=user_input.split(" ");	//명령어를 띄어쓰기를 기준으로 분할함
		if(key.length==1) {	//명령어가 한개라면 path 변경이나 프로그램종료이므로
			setPath();	//setpath호출
		}
		else {		//명령어 두개이상이면
			setCommand();	// setcommand호출
		}
		
	}
	
	void setPath()
	{	
		 if(key[0].equals("그만")) {		//그만이면 종료
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		String checkpath=path;		//경로명존재하는지확인하는 경로명변수
		checkpath=checkpath+"\\"+key[0];
		File check=new File(checkpath);		//경로명이 존재하는지확인
		System.out.println(path);
		if(check.exists()==false) {	//존재하지않으면
			System.out.println("경로명이 존재하지 않습니다.");
			run();
		}
		
		if(key[0].equals("..")) {		//..을 입력했을때
			
			if(current.getParent()==null) {	//현재 경로가 루트노드일때는
				System.out.println("현재 루트노드이므로 이동할 수 없습니다");
				run();
			}
			
			else {	
				path=current.getParent();	//path 부모로 변경
				setFiles();		//file다시설정 후
				run();		//런
			}
			
		}
		
		
		else {		//정상적인 하위라면
		path=path+"\\"+key[0];		//경로명 재설정
		setFiles();
		run();		//다시 run 호출
		}
	}
	
	void setCommand() {
		
		if(key.length==2) {		//명령어가 두개일때
			if(key[0].equals("mkdir")) {	//명령어가 mkdir일때
				File newdir=new File(current,key[1]);
				
				if(newdir.exists()) {	//이미존재하면
					System.out.println("이미 존재하는 디렉터리입니다.");
				}
				else {
					System.out.println(key[1]+"디렉터리를 생성하였습니다.");
					newdir.mkdir();
				}
			}
			else if(key[0].equals("rename")) {
				System.out.println("두개의 파일명이 주어지지 않았습니다.");
			}
			
			setFiles();
			run();
			
		}
		else if(key.length==3) {
			File srcfile=new File(current,key[1]);
			File newfile=new File(current,key[2]);
			
			if(srcfile.exists()) {	//바꿀파일명이존재하고
				if(newfile.exists()) {	//새롭게바꿀이름의 파일명이존재하면
					System.out.println("이미"+key[2]+"파일이 존재합니디");
				}	//오류문구 출력
				
				else {	//바꿔줌
					srcfile.renameTo(newfile);	//파일변경
					System.out.println(key[1]+"을 "+key[2]+" 이름 변경하였습니다. ");
				}
			}
			else {
				System.out.println("파일이 존재하지않습니다.");
			}
			
			setFiles();
			run();
		}
		
		
	}
	
	public static void main(String[] args) {
		practice14 p=new practice14();
		System.out.println("***** 파일 탐색기입니다. *****");
		p.setFiles();
		p.run();
	}
}
