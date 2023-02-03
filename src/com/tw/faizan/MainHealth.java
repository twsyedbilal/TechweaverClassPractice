package com.tw.faizan;

import java.util.ArrayList;
import java.util.List;

public class MainHealth {

	public static void main(String[] args) {
		HealthCard h1 = new HealthCard("A Raheman", 23, 55, "90-115", "99", "A positive");
		HealthCard h2 = new HealthCard("A Muqid", 24, 51, "91-119", "98", "o positive");
		HealthCard h3 = new HealthCard("S Faizan", 23, 55, "93-117", "97", "B positive");
		HealthCard h4 = new HealthCard(" Sohel", 24, 63, "89-116", "97", "A positive");

		List<HealthCard> h = new ArrayList<>();
		h.add(h1);
		h.add(h2);
		h.add(h3);
		h.add(h4);

		for (HealthCard hc : h) {
			System.out.println(hc.toString());

		}
	}

}
