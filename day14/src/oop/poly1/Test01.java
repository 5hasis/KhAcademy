package oop.poly1;

public class Test01 {
	public static void main(String[] args) {
		//μμΊμ€ν(up-casting)
		Phone a = new Galaxy21S();
		a.call();
		
		Galaxy21S b = new Galaxy21S();
		b.call();
	}
}