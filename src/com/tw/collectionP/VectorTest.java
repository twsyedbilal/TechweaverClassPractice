package com.tw.collectionP;

import java.util.Vector;

public class VectorTest {

	Vector<String> v = new Vector<>();

	void performingAddOperationOnVector() {
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
	}

	void performingRemoveOperationOnVector() {
		v.remove(3);
		v.remove("B");
	}

	void performingUpdateOperationOnVector() {
		v.set(0, "AAAA");
	}
	
	void callOtherMathods() {
		
	}

	public static void main(String[] args) {
		VectorTest t = new VectorTest();
		t.performingAddOperationOnVector();
		System.out.println(t.v);
		t.performingRemoveOperationOnVector();
		System.out.println();
		System.out.println(t.v);
		t.performingUpdateOperationOnVector();
		System.out.println();
		System.out.println(t.v);
		System.out.println(t.v.firstElement());
	}
}
