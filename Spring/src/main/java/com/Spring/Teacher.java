package com.Spring;

public class Teacher {
	
	private String name;
	private String domain;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
//		System.out.println("Setter for name called..");
		this.name = name;
	}

	public Teacher(String name, String domain) {
		super();
		this.name = name;
		this.domain = domain;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
//		System.out.println("Setter for domain called..");
		this.domain = domain;
	}

	public void teach() {
		System.out.println("Hello I am "+this.getName()+" and I learn "+this.getDomain());
	}
}
