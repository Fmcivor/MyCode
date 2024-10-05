package mycode;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter your name:");
		String Name = Input.nextLine();
		System.out.println("Welcome " + Name + " to Qub!");
		Input.close();
		

	}

}
