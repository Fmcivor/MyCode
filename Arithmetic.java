package mycode;

public class Arithmetic {

	public static void main(String[] args) {
		int value1 = 5;
		int value2 = 3;
	    int Answer, Remainder;
	    
	    Answer = value1 / value2;
	    Remainder = value1 % value2;
	    
	    System.out.println("Value 1: " + value1 + " Value 2: " + value2);
	    System.out.println("Answer:" + Answer);
	    System.out.println("Remainder:" + Remainder);
	    
	    double Dvalue = value1 / (double)value2;
	    System.out.println("Double Value: "+ Dvalue);
	}

}
