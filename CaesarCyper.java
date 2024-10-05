package mycode;


import java.util.Iterator;
import java.util.Scanner;


public class CaesarCyper {

	public static String enteredWord = "";
	
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		String enteredWord = "";
		int CodeNumber = 0;
		
		System.out.println("Please enter a word: ");
		enteredWord = inputScanner.nextLine();
		
		System.out.println("Please enter a code number: ");
		CodeNumber = inputScanner.nextInt();
		
		String codedString = Encode(enteredWord, CodeNumber);
		System.out.println(codedString);
		
		System.out.print(Decode(codedString, CodeNumber));
		
	}
	
	
	private static String Encode(String enteredString, int cnum) {
		
		String returnString = "";
		
		for (char ch : enteredString.toCharArray()) {
			
			if (ch != ' ') {
			   ch += cnum;
			   
			   if (ch >'z') {
				int initialPos = ch - cnum;
				int diff = 'z'-initialPos;
				ch = 'a';
				ch += cnum-diff-1;
			}
				returnString += ch;
			}
			else {
				returnString +=ch;
			}
			
			}
			
			return returnString;
		}
		
		
		
	
	
	private static String Decode(String codedString, int cnum) {

		String returnString = "";
		
		for (char ch : codedString.toCharArray()) {
			
			if (ch != ' ') {
			   ch -= cnum;
			   
			   if (ch <'a') {
				int initialPos = ch + cnum;
				int diff = initialPos- 'a';
				ch = 'z';
				ch -= cnum-diff-1;
			}
				returnString += ch;
			}
			else {
				returnString +=ch;
			}
			
			}
			
			return returnString;
		
	}
	
	
	

}
