package com.tw.constructor;

public class MainClass {

	public static void main(String[] args) {
		ChildClass c1 = new ChildClass(1, "Taufeeq");
		System.out.println(c1.getChildId());
		System.out.println(c1.getChildName());

		ChildClass c2 = new ChildClass(2, "Faizan");
		System.out.println(c2.getChildId());
		System.out.println(c2.getChildName());

		ChildClass c3 = new ChildClass(3, "Sohel");
		System.out.println(c3.getChildId());
		System.out.println(c3.getChildName());

		ChildClass c4 = new ChildClass();
		System.out.println(c4.getChildId());
		System.out.println(c4.getChildName());

		CopyConstruct c = new CopyConstruct();
		CopyConstruct cc = new CopyConstruct(c);
		System.out.println(cc.getId());
		System.out.println(cc.getName());
	}

}
