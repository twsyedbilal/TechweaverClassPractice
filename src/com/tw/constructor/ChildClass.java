package com.tw.constructor;

public class ChildClass {

	private long childId;
	private String childName;

	// Parameterized constructor
	public ChildClass(long childId, String childName) {
		super();
		this.childId = childId;
		this.childName = childName;
	}

	public ChildClass() {
		this("xyz");
	}
	
	public ChildClass( String childName) {
		this.childName = childName;
	}

	public long getChildId() {
		return childId;
	}

	public void setChildId(long childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
}
