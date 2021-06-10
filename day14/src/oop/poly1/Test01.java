package oop.poly1;

public class Test01 {
	public static void main(String[] args) {
		//업캐스팅(up-casting)
		Phone a = new Galaxy21S();
		a.call();
		
		Galaxy21S b = new Galaxy21S();
		b.call();
	}
}