package com.tw.accessModifier;

import com.tw.methodTest.MethodTest;

public class MethodTestOfSub extends MethodTest {
	public static void main(String[] args) {

		MethodTestOfSub t = new MethodTestOfSub();
		System.out.println(t.module(5, 5));
		System.out.println(t.protectedMember);
		System.out.println(t.publicMemeber);

		t.display_Inner();
	}

	// In static methods we can not create object of sub classes
	void display_Inner() {
		Xyz inner = new Xyz();
		inner.addPrivate();
		Abc a = new Abc();
		defaultClass d = new defaultClass();
		publicClass1 p = new publicClass1();
	}

	private class Xyz {
		void addPrivate() {
			System.out.println("void");
		}
	}

	protected class Abc {

	}

	class defaultClass {

	}

	public class publicClass {

	}

	public class publicClass1 {

	}
}
