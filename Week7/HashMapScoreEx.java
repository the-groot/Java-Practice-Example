package Week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore=new HashMap<>();
		
		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� :"+javaScore.size());
	
		Set<String> keys=javaScore.keySet();
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			int score=javaScore.get(name);
			System.out.println(name+" : "+ score);
		}
	}
	
}
