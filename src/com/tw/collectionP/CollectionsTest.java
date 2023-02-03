package com.tw.collectionP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> laptoplist=new ArrayList<>();
		laptoplist.add("dell");
		laptoplist.add("hp");
		laptoplist.add("lenovo");
		
		for (int i = 0; i < laptoplist.size(); i++) {
			System.out.println(laptoplist.get(i));
		}
		
		//Collections.addAll(flavors, "Peaches 'n Plutonium", "Rocky Racoon");
		Collections.addAll(laptoplist, "accer","apple");
		System.out.println(laptoplist);
		
		Collections.sort(laptoplist);
		System.out.println(laptoplist);
		
		Collections.sort(laptoplist);
		Collections.sort(laptoplist,Collections.reverseOrder());
		System.out.println(laptoplist);
		
		Collections.binarySearch(laptoplist, "aaple");
		System.out.println(Collections.binarySearch(laptoplist, "aaple"));
		
		List<String> copylist=new ArrayList<>();
		copylist.add("lap");
		copylist.add("lap");
		copylist.add("lap");
		copylist.add("lap");
		copylist.add("lap");
		copylist.add("lap");
		
		Collections.copy(copylist, laptoplist);
		System.out.println(copylist);
		
		Collections.reverse(laptoplist);
		System.out.println(laptoplist);
		
	}

}
