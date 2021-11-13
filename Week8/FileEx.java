package Week8;

import java.io.File;

public class FileEx {
	public static void listDirectory(File dir)
	{	
		System.out.println("-----"+dir.getPath()+"�� ���� ����Ʈ �Դϴ�.-----");
		File[] subFiles=dir.listFiles();
		for(int i=0; i<subFiles.length; i++) {
			File f=subFiles[i];
			long t=f.lastModified();
			System.out.println(f.getName());
			System.out.println("\t���� ũ��:"+f.length());
			System.out.printf("\t������ �ð�: %tb %td %ta %tT\n",t, t, t, t);
		}
	}



public static void main(String[] args) {
	File f1=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\8-1.txt");
	System.out.println(f1.getPath()+","+f1.getParent()+", "+f1.getName());
	String res="";
	if(f1.isFile()) res="����";
	else if(f1.isDirectory()) res="���丮";
	System.out.println(f1.getPath()+"��"+res+"�Դϴ�.");
	
	File f2=new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\java_sample");
	if(!f2.exists()) {
		f2.mkdir();
	}
	listDirectory(new File("D:\\Eclipse\\workspace\\test\\src\\Week8"));
	f2.renameTo(new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\javasample"));
	listDirectory(new File("D:\\Eclipse\\workspace\\test\\src\\Week8\\"));
}
}