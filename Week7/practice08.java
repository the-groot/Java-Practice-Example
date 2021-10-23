package Week7;

import java.util.*;

public class practice08 {
	public static void main(String[] args) {
		HashMap<String, Integer> point=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			String name; int p; boolean overlap;
			System.out.print("이름과 포인트 입력>> ");
			name=sc.next();
			if(name.equals("그만"))
				break;
			p=sc.nextInt();
			overlap=point.containsKey(name);
			if(overlap==true) {
				int pointt=point.get(name);
				point.put(name, pointt+p);
			}
			else {
			point.put(name,p);
			}
			
			Set<String> keys=point.keySet();
			Iterator<String> it=keys.iterator();
			
			while(it.hasNext()) {
				String name2=it.next();
				int poin=point.get(name2);
				System.out.println("("+name2+","+poin+")");
			}
		}
		sc.close();
	}
}
