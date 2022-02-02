/**
 * @author waleed
 *
 * 01-Feb-2022
 */

package com.Spring2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EnglishTeacher implements Teacher, InitializingBean, DisposableBean {

	private Laptop theLaptop;

	public Laptop getTheLaptop() {
		return theLaptop;
	}

	public void setTheLaptop(Laptop theLaptop) {
		this.theLaptop = theLaptop;
	}

	public void teach() {
		System.out.println("English teacher teaches...");
		System.out.println("Laptop details : ");
		System.out.println(theLaptop);

	}

	public void destroy() throws Exception {
	System.out.println("EnglishTeacher bean about to be destroyed");	
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("EnglishTeacher Bean instantiated...");
		
	}

}
