package oop.poly2;

public class Test02 {
	public static void main(String[] args) {
		Galaxy g1 = new Galaxy21S("블루");
		g1.call();
		System.out.println(g1.getColor());
		
		IPhone i1 = new IPhone11("쌈무그린");
		i1.call();
		System.out.println(i1.getColor());
		
		Phone p1 = new IPhone12("용달블루");
		p1.call();
		System.out.println(p1.getColor());
	}

}
