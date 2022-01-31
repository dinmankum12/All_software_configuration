package com.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
      // load context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
//    	Get a reference to the bean
    	Teacher teacher = context.getBean("theTeacher",Teacher.class);
    	
//    	call method on the bean
    	teacher.teach();
    	
    	
    	
    }
}
