package oop_les3_hw;

public class Student extends Human implements Comparable<Student>{
	private int record_book;
	
	public Student() {
	}
	public Student(String name, int age, boolean sex, int record_book) {
		super(name, age, sex);
		this.record_book = record_book;
	}
	public int getRecord_book() {
		return record_book;
	}
	public void setRecord_book(int record_book) {
		this.record_book = record_book;
	}

	public void printHumanInfo(){
		System.out.println("Name: "+super.getName() 
						+ ", age: "+super.getAge() 
						+ ", sex: "+super.isSex()
						+ ", record-book: "+ this.record_book);
	}
	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}
	
	


}
