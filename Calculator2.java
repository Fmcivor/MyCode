package mycode;

public class Calculator2 {
	
	
	private String number;
	
	public Calculator2() {
		number = ""+0;
	}
	
	
	
	public String toString() {
		return "" +number;
	}
	
	
	public void pressNumberKey(int n) {
		
		
		
		if (number.equalsIgnoreCase("0")) {
			number = "" + n;
		}
		else {
			number = number + "" +n;
		}
		
	}

}
