package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		Sample s = new Sample();
		
		//extends JFrame
		//s.setBounds(100,100,500,300);
		//s.setVisible(true);
		
		//extends JFileChooser
		//s.showOpenDialog(null);
		
		Sample.showDialog(null,null,null);
		
		
	}
}
