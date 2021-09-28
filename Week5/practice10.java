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
		dic.put("Ȳ����","�ڹ�");
		dic.put("���繮","���̽�");
		dic.put("���繮","C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		
	}
}
