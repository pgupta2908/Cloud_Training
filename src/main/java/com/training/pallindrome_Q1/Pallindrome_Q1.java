
/**
 * @author Pratyush Gupta
 *
 */

package com.training.pallindrome_Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

public class Pallindrome_Q1 {


	public static boolean convert(int input) {

		int inputCopy=input;
		int unitDigit=0;
		int output=0;

		while (input>0)
		{
			unitDigit=input%10;
			input=input/10;
			output=(output*10)+unitDigit;			
		}

		if(inputCopy==output)
		{
			System.out.println("true");
			return true;
		}
		else
		{
			System.out.println("false");
			return false;
		}


	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an input: ");

		try {
			int input = scanner.nextInt();
			convert(input);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
		scanner.close();
				
	}
	
}