package com.tw.sohel;

import java.util.Stack;

public class StackClass {
	Stack<String> s1 = new Stack<>();
	
	Stack<String> stackAdd(){
		s1.push("Sohel");
		s1.push("Faizan");
		s1.push("Bilal");
		s1.push("Taufeeq");
		return s1;
	}
	
	Stack<String> stackRemove() {
		s1.pop();
		s1.pop();
		return s1;
	}
	
	Stack<String> stackPeek(){
		s1.peek();
		s1.peek();
		return s1;
	}
	
	Stack<String> stackSearch(){
		s1.search("Sohel");
		return s1;
	}
	
	
	Stack<String> stackEmpty(){
		s1.empty();
		return s1;
	}
	
	public static void main(String[] args) {
			
		StackClass s2 = new StackClass();
		s2.stackAdd();
		System.out.println(s2.s1);
		
		s2.stackRemove();
		System.out.println(s2.s1);
		
		
		System.out.println(s2.s1.empty());
		
		System.out.println(s2.s1.get(0));
		
		System.out.println(s2.s1.search("Sohel"));
	}
}
