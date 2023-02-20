package com.tw.taufeeq;

import java.util.LinkedHashMap;
import java.util.Map;

public class ByExtendingThreadCpractice extends Thread {
   public void  run(){
		   
		   Map<Double, String> m=new LinkedHashMap<>();
		   m.put(1.0, "taufeeq");
		   m.put(2.0, "faizan");
		   m.put(3.0, "Sohel");
		   for (Map.Entry<Double, String> entry : m.entrySet()) {
			Double key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key);
			System.out.println(val);
		}
		
     }  
 
 
}
