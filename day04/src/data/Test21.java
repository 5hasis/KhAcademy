package data;

import java.lang.*;

public class Test21 {
	public static void main(String[] args) {
		int price = 85000;
		int discount = 30 ;
		int pay = price * (100 - discount) / 100;
		
		System.out.println("할인 전 : " + price);
		System.out.println("할인 후 : " + pay);

	}

}
