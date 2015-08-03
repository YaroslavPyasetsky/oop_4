package oop_les3_hw;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Group {
	private int N = 3;
	private static Scanner in = new Scanner(System.in);
	private Student[] groupArray = new Student[N];
	
	
	
	public Student[] getGroupArray() {
		return groupArray;
	}

	@Deprecated
	public void formGroup(){
		for (int i=0; i<groupArray.length;i++) {
			System.out.println("Please input data for student # "+(i+1));
			
				groupArray[i] = new Student();
				
				System.out.println("Please input Name");
				groupArray[i].setName(in.next());
				
				System.out.println("Please input age");
				groupArray[i].setAge(in.nextInt());
				
				System.out.println("Please input sex (true/false)");
				groupArray[i].setSex(in.nextBoolean());
				
				System.out.println("Please input record-book number");
				groupArray[i].setRecord_book(in.nextInt());
			
		}
	}
	

	public void printHumanInfo(){
		for (int i=0; i<groupArray.length;i++) {
			if (groupArray[i] != null){
				System.out.println("Name: "+groupArray[i].getName() 
								+ ", age: "+groupArray[i].getAge() 
								+ ", sex: "+groupArray[i].isSex()
								+ ", record-book: "+ groupArray[i].getRecord_book());
			}
		}
	}
	
	public void addStudent() throws WrongLenException{
		boolean free = false;;
		for (int i = 0; i < groupArray.length; i++) {
			if (groupArray[i] == null){
			
				groupArray[i] = new Student();
				System.out.println("Info of student #"+(i+1));
				
				////---------------------------------------------------
				System.out.println("Please input Name");
				groupArray[i].setName(in.next());
				
				////---------------------------------------------------
				System.out.println("Please input age");
				do{
					try{
						groupArray[i].setAge(Integer.parseInt(in.next()));
						break;
					}
					catch (NumberFormatException e){ System.out.println("please input integer value for age");}
				}
				while (true);
				
				////------------------------------------------------------
				System.out.println("Please input sex (true/false)");
				do{
					try{
						//System.out.println("Please input sex (true/false)");
						groupArray[i].setSex(in.nextBoolean());
						break;
					}
					catch (InputMismatchException e){ System.out.println("please input true or false for sex");}
				}
				while (true);
				
//				System.out.println("Please input sex (true/false)");
//				do{
//					try{
//						//System.out.println("Please input sex (true/false)");
//						groupArray[i].setSex(Boolean.parseBoolean(in.next()));
//						break;
//					}
//					catch (Exception e){ System.out.println("please input true or false for sex");}
//				}
//				while (true);
				
				
				
				
				////-------------------------------------------------------
				System.out.println("Please input record-book number");
				do{
					try{
						groupArray[i].setRecord_book(Integer.parseInt(in.next()));
						break;
					}
					catch (NumberFormatException e){ System.out.println("please input integer value for record-book");}
				}
				while (true);
					
				free = true;
				break;
			}
		}
		if (!free){throw new WrongLenException();}
	}
	
	public boolean findStudent(String name){
		try{
			for (int i=0; i<groupArray.length;i++) {
				if (groupArray[i].getName().equals(name)){
					System.out.println("Student was found. Name:"+name);
					return true;
				}			
			}
			return false;
		}
		catch (NullPointerException e){
			System.out.println("Student was not found");
			return false;
			}
		
	}

	
}
	
