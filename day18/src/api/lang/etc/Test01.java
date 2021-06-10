package api.lang.etc;

public class Test01 {
	public static void main(String[] args) {
		//Math 클래스 : 수학 계산 클래스
		//= 생성자가 잠겨 있다(private)
		//= new를 쓸 수 없다
		//= 아무데서나 편하게 불러오도록 전부다 static 등록

		//Math m = new Math();//안됨
		
		float a = 1.5f;
		
		//반올림
		int b = (int)(a + 0.5f);
		System.out.println("b = " + b);
		
		int c = Math.round(a);
		System.out.println("c = " + c);
		
		//v와 w의 차이(절대값)
		int v = 10;
		int w = 20;
		
		//int d = v - w  또는 w - v;
		int d;
		if(v > w) {
			d = v - w;
		}
		else {
			d = w - v;
		}
		System.out.println("d = " + d);
		
		int e = Math.abs(v-w);
		System.out.println("e = " + e);
		
		//2의 10제곱을 구하세요!
		int k = 1;
		for(int i=0; i < 10; i++) {
			k *= 2;
		}
		System.out.println("k = " + k);
		
//		double f = Math.pow(2, 10);
		int f = (int)Math.pow(2, 10);
		System.out.println("f = " + f);
		
		//9의 제곱근을 구하세요!
		double g = Math.sqrt(9);
		System.out.println("g = " + g);
	}
}

