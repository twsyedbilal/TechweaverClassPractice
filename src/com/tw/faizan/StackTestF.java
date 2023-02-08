package com.tw.faizan;

import java.util.Stack;

public class StackTestF {
	Stack<String> s = new Stack<>();

	Stack<String> pushOPonStack() {
		s.push("Goat");
		s.push("Sheep");
		s.push("Cow");
		s.push("Fish");
		return s;
	}

	Stack<String> popOPonStack() {
		s.pop();
		return s;
	}

	public static void main(String[] args) {

		StackTestF f = new StackTestF();

		System.out.println(f.pushOPonStack());
		System.out.println();

		System.out.println(f.s.search("Fish"));
		System.out.println();

		System.out.println("POP on Stack : " + f.popOPonStack());
		System.out.println();

		System.out.println(f.s.isEmpty());
		System.out.println(f.s.clone());
		System.out.println(f.s.size());
		System.out.println(f.s.firstElement());
		System.out.println(f.s.lastElement());
		System.out.println(f.s.elementAt(1));

	}
}
