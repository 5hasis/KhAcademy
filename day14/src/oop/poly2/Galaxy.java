package oop.poly2;

public abstract class Galaxy extends Phone {

	public Galaxy(String color) {
		super(color);
	}

	public Galaxy(String color, String number) {
		super(color, number);

	}
	
	/*
	public static String settingColor(String color) {
		if(color != "골드" && color != "실버" && color != "아쿠아블루") {
			color = "";
		}
		return color;
			
	}
	*/

	public abstract void samsungStore();
	
	//
	@Override
	public void setColor(String color) {
		switch(color){
		case "골드":
		case "실버":
		case "아쿠아블루":
			super.color = color;
		default:
			return;
		}
	}

}
