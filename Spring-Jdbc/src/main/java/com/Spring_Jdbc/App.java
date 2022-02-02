package com.Spring_Jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	DbOperations dao = context.getBean("dao", DbOperations.class);
    	
        System.out.println("Number of students registered : " + dao.getCountOfStudents());
    }
}
