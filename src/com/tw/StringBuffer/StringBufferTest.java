package com.tw.StringBuffer;

import com.tw.dto.Employee;

public class StringBufferTest {

	public static void main(String[] args) {
		//A thread-safe, mutable sequence of characters.A string buffer is like a String, but can be modified. At any point in time it contains some particular sequence of characters
		char[] varchar= {'a','b'};
		Employee emp=new Employee();
		emp.setId(1234567);
		emp.setName("xyz");
		
		StringBuffer sb=new StringBuffer("Hi ");
		sb.append( false);
		sb.append('a');
		sb.append(varchar);
		sb.append(2.0);
		sb.append(emp.getId());
		sb.append(emp.getName());
		sb.append(emp);
		System.err.println(sb);
		
		StringBuffer sb2=new StringBuffer(" HI");
		sb2.insert(0, false);
		sb2.insert(8, " ALL");
		System.out.println(sb2);
		
		System.out.println(sb2.reverse());
		//start index 0 and  end index -1
		System.out.println(sb2.replace(0, 3, "K"));
		System.out.println(sb2.delete(0, 1));
		System.out.println(sb2.capacity());
		System.out.println(sb2.charAt(1));
		if(!sb2.isEmpty() && sb2!=null) {
			
		}
		
		
		StringBuilder sbuilder=new StringBuilder();
	}

}
