package com.tw.constructor;

public class CopyConstruct {
	int id;
	String name;

	public CopyConstruct() {
		System.out.println();
	}

	public CopyConstruct(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CopyConstruct(CopyConstruct c) {
		this(1, "xyz");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
