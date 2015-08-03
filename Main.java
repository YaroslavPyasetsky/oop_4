package oop_les3_hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Group group = new Group();
		
//		group.formGroup();
//		group.printHumanInfo();

		String input = "";
		
		do{
			System.out.println("input variants: add/print/find/sort/exit");
			input = scanner.next();
			//System.out.println("input variants: add/print/find/sort/quit");
			if (input.equals("add")){group.addStudent();}
			else if (input.equals("print")){group.printHumanInfo();}
			else if (input.equals("find")){
				System.out.println("Print the name of student to find: ");
				group.findStudent(scanner.next());
			}
			else if (input.equals("sort")){
				try{
					Arrays.sort(group.getGroupArray());
				}
				catch (NullPointerException e){
					//System.out.println(e.toString());
					//System.out.println("group is not full");
				}
				group.printHumanInfo();
			}
		}
		while (!input.equals("exit"));
		
		
	}

}
