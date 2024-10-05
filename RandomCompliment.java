package mycode;


import java.util.Random;



public class RandomCompliment {

	public static void main(String[] args) {
		
		String[] Greetings = new String[] {"Hello " , "Hey " , "Goodmorning " , "Goodnight "};
		String[] compliment = new String[] {"Beautiful","Gorgeous","Sexy", "Baby", "Smelly"};

		
		Random rand = new Random();
		int greetingsIndex = rand.nextInt(4);
		
		
		int complimentIndex = rand.nextInt(5);
		
		
		System.out.print(Greetings[greetingsIndex]+compliment[complimentIndex]);
	}

}
