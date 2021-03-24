package api.lang.string;

public class Test02 {
	public static void main(String[] args) {
		//new가 있고 없고의 차이
		
		String a = "hello";
		String b = "hello";
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println(a == b); //true
		System.out.println(b == c); //false
		System.out.println(c == d); //false
	}
}
