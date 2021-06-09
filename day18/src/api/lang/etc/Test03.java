package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {
//		Runtime 클래스
//		= 외부 실행환경 관리 클래스
//		= 생성자가 없음(private)
//		= 멤버가 존재함
//		= 미리 객체를 만들어놓고 만들어진 객체만 이용할 수 있도록 제한을 걸어둔 형태(생성제한)
		
//		Runtime r = new Runtime();//직접 생성한다.
		Runtime r = Runtime.getRuntime();//생성을 부탁한다
		
//		exec()를 이용하면 외부 커맨드를 사용할 수 있다.
//		= 예외 발생! (100% 실행을 장담할 수 없으므로)
		
//		r.exec("notepad");
//		r.exec("calc");
//		r.exec("mspaint");
		r.exec("cmd /c start https://google.com");
	}
}

