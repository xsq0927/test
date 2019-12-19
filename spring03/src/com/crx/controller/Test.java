package com.crx.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crx.pojo.Person;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");//·´Éä»úÖÆ
Person p=ctx.getBean(Person.class);
System.out.println(p);
	}
}
