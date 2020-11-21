package cal_demo;

import java.util.Scanner;

public class CalDemo {

	public static void main(String[] args) {
		int num1,num2;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1 = in.nextInt();
		
		System.out.println("Enter 2nd number: ");
		num2 = in.nextInt();
		
		System.out.println("Sum of The Numbers = "+(num1+num2));
		System.out.println("Subtract The Numbers = "+(num1-num2));
		System.out.println("Multiply The Numbers = "+(num1*num2));
		System.out.println("Divide The Numbers = "+(num1/num2));
	}

}
