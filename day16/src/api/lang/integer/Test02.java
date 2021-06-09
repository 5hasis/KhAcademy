package api.lang.integer;

public class Test02 {
	public static void main(String[] args) {
		// Q. Integer는 뭐하는 클래스일까?
		// A. int와 세트로 구성된 클래스 (Wrapper class, 하이브리드 클래스)

		// 원시형(기본형)으로 덧셈 : 기본적으로 제공되는 연산자 사용 가능
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

		// 참조형으로 덧셈 : 클래스의 구조에 맞게 메소드나 생성자, 변수 등을 활용해야 가능
		Integer d = new Integer(10);
		Integer e = new Integer(20);
		Integer f = Integer.sum(d, e);

		// Integer f = d + e; //되긴되요. 그래서 하이브리드라고 부르는거에용

		System.out.println(f.toString());

		// 원시형으로 15를 2진수로 변환
		// 15 = 8 + 4 + 2 + 1 = 2³ + 2² + 2¹ + 1 = 1111₂
		int num = 1234;
		String str = "";
		for (int i = num; i > 0; i /= 2) {
			str = i % 2 + str;
		}
		System.out.println(str);
		
		//참조형으로 15를 2진수로 변환
		System.out.println(Integer.toBinaryString(num));
	
		//원시형 & 참조형 섞어서 사용 가능
		Integer s1 = 10;
		Integer s2 = 10; //실제로는 원시형이지만 보관이 참조형으로
		//10이라는 수를 s1,s2가 가르키는 것
		Integer s3 = s1 + s2;
		System.out.println(s3);
		
		
		
		
	}

}
