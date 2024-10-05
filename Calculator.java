package mycode;

import java.io.Console;
import java.util.Scanner;



public class Calculator {

 static	int value1 = -1;
	static int value2 = -1;
	static String operator = "";
	static	boolean ValidCalculation = true;
	static boolean Continue = false;
	
	public static void main(String[] args) {
		
		
	
		
		do {
			
		
		Scanner Input = new Scanner(System.in);
		
			
			value1 = -1;
			value2 = -1;
			
					
			
			ValidCalculation = true;
			Continue= false;
			
			
			Request1stDigit(Input);
			Request2ndDigit(Input);
			RequestOperator(Input);
			
		   if (value2 == 0 && operator.equals("/")) 
		   {
			System.out.println("Impossible calculation as you cannot divide by 0");
			ValidCalculation = false;
			
		   }
		   else 
		   {
			   String anString = "";
			 if (operator.equals("/")) {
				
				 anString = Integer.toString(value1 / value2);
			}
			 else if (operator.equals("*")) {
					
				 anString = Integer.toString(value1 * value2);
				}
			 else if (operator.equals("+")) {
					
				 anString = Integer.toString(value1 + value2);
				}
			 else if (operator.equals("-")) {
					
				 anString = Integer.toString(value1 - value2);
				}
			 
			 System.out.println(value1 + operator + value2 + "=" + anString);
			 System.out.print("Would you like to perform another calculation? Please enter yes or no. ");
			 
			 String continueString = Input.next();
			 
			 if (continueString.equalsIgnoreCase("Yes")) {
				Continue = true;
			}
		   }
		   
		  
		
		}while(ValidCalculation == false || Continue);
		
		
	
	   
		
		
		
		
		

	}
	
	
	
	private static void Request1stDigit(Scanner Input) {
		
		boolean Value1IsDigit = true;
		String V1 = "";
		do {
			if (ValidCalculation) {
				 System.out.print("Please enter a number: ");
			}
			else {
				System.out.println("Please enter a number");;
			}
		 
		  Value1IsDigit = true;
		   V1 = Input.next();
		  for(char ch : V1.toCharArray()) {
			  if(Character.isDigit(ch) !=true) {
				  Value1IsDigit = false;
				  break;
			  }
			  
		  }
		  
		  if(Value1IsDigit) {
			  value1 = Integer.parseInt(V1);
		  }
		}
		while(Value1IsDigit == false);
		
		
	}
	
	
	

	private static void Request2ndDigit(Scanner Input) {

		boolean Value2IsDigit = true;
		String V2 = "";
		do {
		  System.out.print("Please enter a number: ");
		  Value2IsDigit = true;
		   V2 = Input.next();
		  for(char ch : V2.toCharArray()) {
			  if(Character.isDigit(ch) !=true) {
				  Value2IsDigit = false;
				  break;
			  }
			  
		  }
		  
		  if(Value2IsDigit) {
			  value2 = Integer.parseInt(V2);
		  }
		}
		while(Value2IsDigit == false);
		
		
		
	}
	
	private static void RequestOperator(Scanner Input) {
		Boolean validOperator = false;
		   
		   
		   do {
			   
			   
			   System.out.print("Please select either +,-,* or /: ");
			   operator = Input.next();
			   if (operator.equals("+" )|| operator.equals("-" ) || operator.equals("*" ) || operator.equals("/" ) ) {
				validOperator = true;
			}
			else {
				validOperator = false;
			}
			   
			
		} while (validOperator == false);
		  
		   
	}
}



