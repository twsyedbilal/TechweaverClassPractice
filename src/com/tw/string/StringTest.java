package com.tw.string;

public class StringTest {

	public static void main(String[] args) {
		String str="   Techweaver Systems PVT LTD   ";
				//  01234567891	
		//Returns the length of this string.The length is equal to the number of Uni codecode units in the string.
		int length=str.length();
		System.out.println(length); //26
		
		char c=str.charAt(5);
		System.out.println(c);
		
		String ret=str.substring(2);
		System.out.println(ret);
		ret=str.substring(2, 9);
		System.out.println(ret);
		
		String a="a";
		String b="b";
		String ab=a.concat(b);
		System.out.println(ab);
		
		
		int index=str.indexOf("e");
		System.out.println(index);
		
		index=str.indexOf("e", 2);
		System.out.println(index);
		
		index=str.lastIndexOf("e");
		System.out.println(index);
		
		String gf1="sana";
		String gf2="rena";
		String wife="Sana";
		System.out.println(gf1.equals(gf2));
		System.out.println(gf1.equals(wife));
		System.out.println(gf1.equalsIgnoreCase(wife));
		
		index=gf1.compareTo(wife);
		System.out.println(index);
		
		index=gf1.compareToIgnoreCase(wife);
		System.out.println(index);
		
		System.out.println(gf2.toUpperCase());
		System.out.println(gf2.toLowerCase());
		
		System.out.println(str.trim());
		
		String newgf=gf1.replace('a', 'o');
		newgf=newgf.replace('s', 'l');
		System.out.println(newgf);
		System.out.println(wife.contains("S"));
		
		String sp="a,b,c,d,ffff,ggg,hhhhh";
		
		sp.split(",");
	}

}
