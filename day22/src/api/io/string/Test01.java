package api.io.string;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//목표 : 문자열을 깨지지 않도록 파일에 저장(출력)
		//=문자열은 byte와 호환 가능
		
		String text = "Hello 자바";
		
		String encoding = new OutputStreamWriter(System.out).getEncoding();
		System.out.println("기본글꼴 : " + encoding);
		
		//text를 byte로 변환 --> byte[]
		byte[] a = text.getBytes(); //자바의 기본 글꼴에 맞게 byte로 분해
		System.out.println(Arrays.toString(a));
		
		byte[] b = text.getBytes("MS949");
		System.out.println(Arrays.toString(b));
		
		//byte를 String으로 변환
		String t1 = new String(a);
		System.out.println("t1 = " + t1);
		
		String t2 = new String(b, "MS949"); //글꼴간의 변환
		System.out.println("t2 = " + t2);
		
		
	}
	

}
