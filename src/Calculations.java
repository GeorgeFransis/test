package src;

import java.util.Scanner;

public class Calculations
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "Enter a number: ");
		int number;
		number = keyboard.nextInt();

		System.out.print( "Enter a second number: ");
		int second;
		second = keyboard.nextInt();

		System.out.print( "Enter a string: ");
		keyboard.nextLine();
		String string1;
		string1 = keyboard.nextLine();

		System.out.print( "Enter a second string: ");
		String string2;
		string2 = keyboard.nextLine();

		String firstw = string1.toUpperCase();
		String secondw = string2.toLowerCase();
		
		char first1;
		first1 = string1.charAt(0);
		char first2;
		first2 = string2.charAt(0);

		char last1;
		last1 = string1.charAt(string1.length()-1);
		char last2;
		last2 = string2.charAt(string2.length()-1);

		int sum, difference, product, quotient, modulo, quotientFloat;
		
		sum = number + second;
		difference = number - second;
		product = number * second;
		quotient = number / second;
		modulo = number % second;
		double numberD = number; //this makes number into a double with casting
		double secondD = second;
		double quotientDouble = numberD/secondD;

		System.out.println(number + " + " + second + " = " + sum);
		System.out.println(number + " - " + second + " = " + difference);
		System.out.println(number + " * " + second + " = " + product);
		System.out.println(number + " / " + second + " = " + quotient);
		System.out.println(number + " % " + second + " = " + modulo);
		System.out.println(number + " / " + second + " = " + quotientDouble);
		System.out.println("First word, uppercase: " + firstw);
		System.out.println("Second word, lowercase: " + secondw);
		System.out.println("First characters: " + first1 + " and " + first2);
		System.out.println("Last characters: " + last1 + " and " + last2);
	}
}