package oop_les3_hw;

public class Human {
	private String name;
	private int age;
	private boolean sex;
	public Human(){};
	public Human(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public void printHumanInfo(){
		System.out.println("Name: "+this.name + ", age: "+this.age +", sex: "+this.sex);
	}
	
}
