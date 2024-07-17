package com.inter.ext;

public class DefMain {

	public static void main(String[] args) {
		IMobile mobile = new FeaturePhone();
		mobile.call();
		mobile.payBills();
		mobile.playGames();
	}
}
