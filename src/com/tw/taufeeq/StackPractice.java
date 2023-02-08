package com.tw.taufeeq;

import java.util.Stack;

public class StackPractice {

	Stack<String> s=new Stack<>();
	Stack<String> pushOperation() {
		s.push("apple");
		s.push("mango");
		s.push("grapes");
		s.push("strawberry");
		
		return s;
		
		
			
		
	}
	Stack<String> popOperation (){
		s.pop();
		return s;
		
	}
	Stack<String> peekOperation(){
		s.peek();
		
		return s;
		
	}
	
	public static void main(String[] args) {
		StackPractice sp=new StackPractice();
		sp.pushOperation();
		System.out.println(sp.s);
		sp.popOperation();
		System.out.println();
		System.out.println(sp.s);
		sp.peekOperation();
		System.out.println();
		System.out.println(sp.peekOperation().peek());
	}
}

