package com.inter.ext;

public interface IMobile {
	void call();
	void sendSMS();
	default void payBills() {
		System.out.println("paybills");
	}
	default void playGames() {
		System.out.println("play brick games");
	}

}
