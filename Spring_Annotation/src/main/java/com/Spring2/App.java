package com.Spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	
    public static void main( String[] args )
    {
    	
//    	Load the context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");
    	
//    	Get a reference to the bean
    	Teacher teacher = context.getBean("anTeacher" , AnnotationsTeacher.class);
    	
//    	Teacher otherTeacher = context.getBean("englishTeacher", EnglishTeacher.class);
//    	
//    	if(teacher == otherTeacher)
//    		System.out.println("Same objects");
//    	else
//    		System.out.println("Different objects");
//    	
//    	System.out.println(teacher + "\n" + otherTeacher);
    	 	
//    	Call methods on the bean
    	teacher.teach();
    	

       
    }
}
