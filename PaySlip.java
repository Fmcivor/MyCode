package mycode;

import java.util.Scanner;


public class PaySlip {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String data = "";
		double gross;
		//final basically means unchangeable or a constant
		final double TAX_RATE = 0.2;
		double net, tax;
		
		data = data + "Gross\t\tTax\t\tNet\n";
		data = data + "=====\t\t===\t\t===\n";
		
		do {
			System.out.print("Enter Gross Pay: ");
			gross = Input.nextDouble();
			if(gross > 0) {
				tax = gross * TAX_RATE;
				net = gross - tax;
				data = data +  gross + "\t\t" + tax + "\t\t" + net + "\n";
			}
			
		}while(gross>0);
		
		System.out.println(data);
		Input.close();
	}

}
