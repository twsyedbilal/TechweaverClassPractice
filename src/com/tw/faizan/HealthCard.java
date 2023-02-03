package com.tw.faizan;

public class HealthCard {
	String name;
	int age;
	int wieght;
	String bp;
	String oxygen;
	String bloodgr;

	public HealthCard(String name, int age, int wieght, String bp, String oxygen, String bloodgr) {
		super();
		this.name = name;
		this.age = age;
		this.wieght = wieght;
		this.bp = bp;
		this.oxygen = oxygen;
		this.bloodgr = bloodgr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWieght() {
		return wieght;
	}

	public void setWieght(int wieght) {
		this.wieght = wieght;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getOxygen() {
		return oxygen;
	}

	public void setOxygen(String oxygen) {
		this.oxygen = oxygen;
	}

	public String getBloodgr() {
		return bloodgr;
	}

	public void setBloodgr(String bloodgr) {
		this.bloodgr = bloodgr;
	}

	@Override
	public String toString() {
		return "HealthCard [name=" + name + ", age=" + age + ", wieght=" + wieght + ", bp=" + bp + ", oxygen=" + oxygen
				+ ", bloodgr=" + bloodgr + "]";
	}

}
