package com.tw.collectionP;

import java.util.Stack;

public class StackTest {

	Stack<String> s = new Stack<>();

	Stack<String> performPushOponStack() {
		s.push("A");
		s.push("B");
		s.push("C");
		return s;
	}

	Stack<String> performPopOponStack() {
		s.pop(); // it will remove c
		return s;
	}

	Stack<String> performpeekOponStack() {
		s.peek(); // it will return B
		return s;
	}

	Stack<String> performSearchOponStack() {
		s.search("A"); // 0
		return s;
	}

	Stack<String> performEmptyOponStack() {
		s.empty();
		return s;
	}
	
	public static void main(String[] args) {
		StackTest st=new StackTest();
		System.out.println(st.performPushOponStack());
		System.out.println(st.performPopOponStack());
		System.out.println(st.s.peek());
		System.out.println(st.s.search("B"));
		System.out.println(st.s.empty());
		System.out.println(st.s.indexOf("A"));
	}
}
