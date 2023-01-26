package com.tw.constructorSuperThis;

public class ParentClass {
	int id;
	String name;
	
	public ParentClass() {
		this(1,"XYZ");
	}
	
	public ParentClass(int i, String a) {
		this.id=i;
		this.name=a;
		System.out.println(getId()+" "+getName());
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
