package com.crx.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//默认为Person
public class Person {
	@Value("xiao123")
	  private String name;
	  // @Resource//先按byName找 类上标注注解为@Component("d")的
    //如果没有，再按byType去找
@Autowired //直接按byType去找
@Qualifier("d")
	  private Dog dog;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dog=" + dog + "]";
	}
	  

}
