package com.mashibing;

/**
 * ClassName: Person
 * Package: com.mashibing
 * Description:
 *
 * @Author R
 * @Create 2024/4/27 11:01
 * @Version 1.0
 */
public class Person {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
