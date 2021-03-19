package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Chrome c = new Chrome("www.google.com", "87");
		Edge e = new Edge("www.microsoft.com", "89");

		c.move();
		c.refresh();
		c.develop();

		e.move();
		e.refresh();
		e.windows();
	}

}
