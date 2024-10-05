package mycode;

public class Calculator2Tester {

	public static void main(String[] args) {
		
		Calculator2 calculator = new Calculator2();
		
		System.out.println(calculator.toString());
		
		calculator.pressNumberKey(1);
		
		System.out.println(calculator.toString());
		if (calculator.toString().equals("1")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
