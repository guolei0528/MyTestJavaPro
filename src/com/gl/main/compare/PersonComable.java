package com.gl.main.compare;

public class PersonComable implements Comparable<PersonComable>{
	
	private String name;
	
	private int age;
	
	

	public PersonComable(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(PersonComable paramT) {
		if(this.age == paramT.age) {
			return 0;
		}
		
		if(this.age>paramT.age) {
			return 1;
		}
		
		if(this.age < paramT.age) {
			return -1;
		}
		// TODO 自动生成的方法存根
		return 0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "PersonComable [name=" + name + ", age=" + age + "]";
	}
	
	

}
