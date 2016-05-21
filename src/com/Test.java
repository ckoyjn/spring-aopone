package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dragon.study.IStudent;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudent person = (IStudent) ctx.getBean("student");
		person.addStudent("dragon");
//		 person.addStudent("javadragon");
		 person.deleteStudent("dragon");
	}
}
