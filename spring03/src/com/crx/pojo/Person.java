package com.crx.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//Ĭ��ΪPerson
public class Person {
	@Value("xiao123")
	  private String name;
	  // @Resource//�Ȱ�byName�� ���ϱ�עע��Ϊ@Component("d")��
    //���û�У��ٰ�byTypeȥ��
@Autowired //ֱ�Ӱ�byTypeȥ��
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
