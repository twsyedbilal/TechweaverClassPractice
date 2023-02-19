package com.tw.mutithreading;

import java.util.LinkedHashMap;
import java.util.Map;

public class ByExtendingThreadClass extends Thread {
	
	Map<Integer, String> m=new LinkedHashMap<>();
	
	//The return type of run method should be void
	//The return type is incompatible with Thread.run()
	public void run(){
		m.put(1, "a");
		m.put(2, "z");
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key);
			System.out.println(val);
		}
	}
}
