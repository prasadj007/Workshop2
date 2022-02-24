package com.bridgelabz.AutoShop;

public class Sedan extends Car{
	int length;

	public Sedan(int speed, int regularPrice, String colour, int length2) {
		super(speed, regularPrice, colour);
		this.length = length;
	}

	@Override
	public double getSalePrice() {
		if(length > 20){
			regularPrice = regularPrice - (regularPrice / 20);
		}
		else{
			regularPrice = regularPrice - (regularPrice / 10);
		}
		return regularPrice;
	}

	@Override
	public String toString() {
		return "Sedan(length=" +length+ ", getSalePrice=" +getSalePrice()+")";
	}
}


