package Week7;

import java.util.*;

class Location{
	private int longitude, latitude;
	private String city;
	
	public Location(String city, int longitude, int latitude) {
		this.city=city;
		this.longitude=longitude;
		this.latitude=latitude;
	}
	
	public int getlongitude() {
		return longitude;
	}
	
	public int getlatitude() {
		return latitude;
	}
	public String getcity() {
		return city;
	}
}

public class practice06 {
	public static void main(String[] args) {
		HashMap<String, Location> city=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String name=sc.next();
			city.put(name, new Location(name, sc.nextInt(), sc.nextInt()));
		}
		System.out.println("-----------------");
		Set<String> keys=city.keySet();
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			Location location;
			location=city.get(name);
			System.out.println(location.getcity()+" "+location.getlongitude()+" "+location.getlatitude());
		}
		System.out.println("-----------------");
		
		while(true) {
			System.out.print("도시 이름 >>");
			String name=sc.next();
			if(name.equals("그만"))
				break;
			
				Location location=city.get(name);
				if (location==null) {
				System.out.println("그런 도시 또 없습니다.");
				continue;
				}
			if(location.getcity().equals(name)) {
				System.out.println(location.getcity()+" "+location.getlongitude()+" "+location.getlatitude());
			}
			 
		}
		sc.close();
	}
}
