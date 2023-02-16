package com.tw.taufeeq;

public class Students {

	private Long id;
	private String name;
	public Students(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	 
	
}
