package input;

import java.lang.*;

public class Test01 {
	public static void main(String[] args)throws IOException { 
		//System.in을 이용하여 사용자가 입력한 값 입력받기
		//-System.in.read()를 이용하면 사용자가 입력한 ASCII 값 1개를 불러들임
		//-1글자만 입력된다는 한계 때문에 사용이 매우 까다로움
		
		int a = System.in.read();
		System.out.println("a = " + a);
		
		//enter => \r\n
	}

}
