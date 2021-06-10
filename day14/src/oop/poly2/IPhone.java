package oop.poly2;

public abstract class IPhone extends Phone{

	public IPhone(String color) {
		super(color);
	}
	
	public IPhone(String color, String number) {
		super(color,number);
	}
	
	/*
	public static String settingColor(String color) {
		if(color == "화이트" || color == "블랙" || color == "핑크")
			return color;
		else return "";
		
	}
	*/
	
	public abstract void siri();
	
	//
	@Override
	public void setColor(String color) {
		switch(color){
		case "화이트":
		case "블랙":
		case "핑크":
			super.color = color;

		default:
			return;
		}
	}

	
	
}
