package com.tw.StringBuffer;

public class Bufferbuilderr {

	public static void main(String[] args) {

		String str="Muhammad Taufeeq";
		StringBuffer sb=new StringBuffer(" hi there "+str);
		System.out.println(sb);
		sb.append(true);
		for (int s = str.length()-1;s>=0; s--) {
			System.out.println(str.charAt(s));
		}
		
		
		
		
		
		
	}

}
