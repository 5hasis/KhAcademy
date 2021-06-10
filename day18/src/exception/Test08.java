package exception;

public class Test08 {
	public static void main(String[] args) {
		try {
//			System.out.println(10 / 0);
		
			int a = Calculator.div(10, 0);
//			int a = Calculator.div(0, 10);
			System.out.println(a);
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.err.println("예외 발생!");
		}
		
	}
}