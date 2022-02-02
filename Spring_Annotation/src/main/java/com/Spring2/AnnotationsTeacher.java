/**
 * @author waleed
 *
 * 01-Feb-2022
 */

package com.Spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("anTeacher")
public class AnnotationsTeacher implements Teacher {
	
	@Autowired //DI - Directly on the field
	@Qualifier("otherLaptop")
	private Laptop laptop;
	
	public AnnotationsTeacher() {
		
	}
	
	@Override
	public void teach() {
	System.out.println("Annotations Teacher's teach...");
	System.out.println("I have used the laptop:");
	System.out.println(laptop);
		
	}
}
