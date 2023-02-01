package com.tw.sohel;

import java.util.ArrayList;
import java.util.List;

public class CollectionPra {
public static void main(String[] args) {
	Mobiles m1 = new Mobiles("VIVO", "V22", 14000, "Black", 6.1);
	Mobiles m2 = new Mobiles("Realme", "C30", 5549, "Denim Black", 6.0);
	Mobiles m3 = new Mobiles("Redmi", "9i sport", 7499, "Coral Green", 5.9);
	Mobiles m4 = new Mobiles("INfinix", "HOT 20", 8599, "Luna Blue", 5.5);
	Mobiles m5 = new Mobiles("POCO", "M4 Pro", 16499, "Power Black", 6.2);
	
	
	List<Mobiles> list =new ArrayList<>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	list.add(m5);
	
	for(Mobiles details : list ) {
		System.out.println(details.toString());
	}
}
}
