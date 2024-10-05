package mycode;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Please enter a letter:");
		String InputLetter = Input.nextLine();
		char Letter = InputLetter.charAt(0);
		Letter = Character.toLowerCase(Letter);
		
		switch(Letter){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("The letter is a vowel");
			break;
		default:
			System.out.println("The letter is not a vowel");
			
		}
		
		
		
	//	if(Letter == 'a' || Letter == 'e' || Letter == 'i' || Letter == 'o' || Letter == 'u' ) {
	//		System.out.println("The letter is a vowel");
	//	}
	//	else {
	//		System.out.println("The letter is not a vowel");
	//	}

	}

}
