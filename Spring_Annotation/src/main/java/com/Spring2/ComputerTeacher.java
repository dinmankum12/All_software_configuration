/**
 * @author waleed
 *
 * 31-Jan-2022
 */

package com.Spring2;

import java.util.List;

public class ComputerTeacher implements Teacher {

	private String name;

	private String domain;
	
	private List<Laptop> laptops;
	
//	private Laptop laptop;

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// System.out.println("setter for name called");
		this.name = name;
	}

	public ComputerTeacher(String name, String domain) {

		this.name = name;
		this.domain = domain;
	}
	
	public ComputerTeacher() {
		
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		// System.out.println("setter for domain called");
		this.domain = domain;
	}

	public void teach() {
		System.out.println("Hello I am " + this.getName() + " and I teach " + this.getDomain());
		System.out.println("Below are are the laptops I have used until now:");
		
		laptops.forEach(System.out::println);
		
//		System.out.println("I currently own a " + this.getLaptop().getName()
//				+ " from " + this.getLaptop().getCompany()
//				+ " with " + this.getLaptop().getRam() + " gb ram.");
	}
	
	
	public void callAtStart() {
		System.out.println("ComputerTeacher bean instantiated");
	}
	
	public void callAtEnd() {
		System.out.println("ComputerTeacher bean about to be destroyed");
	}
	
	
	
	
	
}
