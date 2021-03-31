package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Test01에서 저장한 객체(java.util.Data) 불러오기
		//=객체 입출력은 무수히 많은 자료형의 객체들을 저장할 수 있음
		//=자료형을 고려하면서 저장하기가 어렵고, 성능도 느려짐
		//=Obejct 형태로 업-캐스팅해서 저장(아무거나)
		//=개발자가 저장한 형태를 알고 있을 것이기 때문에 프로그램에서 신경쓰지 않기 때문에 성능 향상!
		
		//준비물 : 파일객체 + 스트림 3종세트
		
		File target = new File("kh", "object.kh");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream obin = new ObjectInputStream(buffer);
		
		//[프로그램] <- obin(역직렬화+조립) <- buffer(대기실) <- in(통로) <- target <- [object.kh]
		
		Object object = obin.readObject();
		System.out.println(object.getClass());
		Date d = (Date)object; //다운캐스팅(원래 Date였던 객체를 Object로 보관하다가 되돌림)
		
		obin.close();
		
		System.out.println(d);
	}
	

}
