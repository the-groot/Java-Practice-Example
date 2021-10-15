package Week6;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		System.out.println(a + "의 길이는 " + a.length()); 
		System.out.println(a.contains("#")); 
		a = a.concat(b); 
		System.out.println(a);
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		a = a.replace("C#","Java"); 
		System.out.println(a);
		String s[] = a.split(","); // 문자열 분리
		for (int i=0; i<s.length; i++)
		System.out.println("분리된 문자열" + i + ": " + s[i]);
		a = a.substring(5); 
		System.out.println(a);
		char c = a.charAt(2); 
		System.out.println(c);
		}
}
