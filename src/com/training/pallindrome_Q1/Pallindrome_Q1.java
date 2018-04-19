
/**
 * @author Pratyush Gupta
 *
 */

package com.training.pallindrome_Q1;

import java.util.Scanner;

import java.util.Scanner;

public class Pallindrome_Q1 {

	public static void inputCopyainput(String[] args) {

		int x=0, out=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("inputput: ");

		try 
		{
			int input=scanner.nextInt();
			int inputCopy=input;

			while (input>0)
			{
				x=input%10;
				input=input/10;
				out=(out*10)+x;			
			}

			if(inputCopy==out)
				System.out.println("true");
			else
				System.out.println("false");
		}
		catch (Exception e)
		{
			System.out.println("Please provide valid inputput values");
		}
		scanner.close();

	}

}