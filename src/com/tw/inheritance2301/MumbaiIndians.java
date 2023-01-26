package com.tw.inheritance2301;

public class MumbaiIndians implements IPL {

	@Override
	public void registerTeam(String tName, String director, int sizeOfT) {
		System.out.println("Team Name "+tName);
		System.out.println("Director Name "+director);
		System.out.println("Size of Team "+sizeOfT);
	}

	@Override
	public void buyPlayer(String name, double price) {
		System.out.println("Player Name "+name);
		System.out.println("Price of Player "+price);
	}

}
