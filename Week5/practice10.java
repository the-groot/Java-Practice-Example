package Week5;

abstract class PairMap{
	protected String KeyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	private int count;
	
	Dictionary(int n){
		KeyArray=new String[n];
		valueArray=new String[n];
		this.count=0;
	}
	
	protected String get(String key) {
		for(int i=0; i<KeyArray.length; i++) {
			if(key.equals(KeyArray[i]))
				return valueArray[i];
		}
		return null;
	}
	
	protected void put(String key, String value) {
		for(int i =0; i<this.count; i++) {
			if(KeyArray[i].equals(key)) {
				valueArray[i]=value;
				return;
			}
		}
		KeyArray[this.count]=key;
		valueArray[this.count]=value;
		count++;
	}
	
	protected String delete(String key) {
		for(int i=0; i<this.count; i++) {
			if(key.equals(KeyArray[i])) {
				String str=valueArray[i];
				valueArray[i]=null;
				KeyArray[i]=null;
				return str;
		}
	}
		return null;
	}
	
	protected int length() {
		return count;
	}
	
}

public class practice10 {
	public static void main(String[] args) {
		Dictionary dic=new Dictionary(10);
		dic.put("황기태","자바");
		dic.put("이재문","파이썬");
		dic.put("이재문","C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		
	}
}
