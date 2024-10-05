package mycode;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordCaseStudy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a single word: ");
		String Word = input.nextLine();
		int LetterCount = Word.length();
		char[] WordLetters = Word.toCharArray();
		int gap = LetterCount-2;
		
		if (gap <= 0) {
			gap =0;
		}
		char[] spaces = new char[0];
		
	Arrays.fill(spaces, ' ');
		
		System.out.println(Word);
		
		for(int i=1; i<Word.length()-1;i += 1) 
		{
				
			
				System.out.print(WordLetters[i]); 
				
				System.out.print(spaces);
				
				System.out.println(WordLetters[LetterCount-i-1]);
				
				
				
			
			
		}
		
			for (int j = Word.length()-1; j >= 0; j--) {
				System.out.print(WordLetters[j]);
			}	
				
				
			
	}
		
	}
	

		
		


	


