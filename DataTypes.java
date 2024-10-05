package mycode;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter an integer followed by a double:");
		int Inum = Input.nextInt();
		double Dnum = Input.nextDouble();
		System.out.println("Integer:"+ Inum + " Double:" + Dnum);
		Input.close();

	}

}
