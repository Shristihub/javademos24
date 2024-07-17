package com.inter.ext;

public class FeaturePhone implements IMobile{
	@Override
	public void call() {
		System.out.println("calling people");
	}
	@Override
	public void sendSMS() {
		System.out.println("send messages to people");
	}
	@Override
	public void playGames() {
		System.out.println("play mario game");
		IMobile.super.playGames();
	}
	

}
