package Week7;

import java.util.*;

public class practice08 {
	public static void main(String[] args) {
		HashMap<String, Integer> point=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true) {
			String name; int p; boolean overlap;
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			name=sc.next();
			if(name.equals("�׸�"))
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
