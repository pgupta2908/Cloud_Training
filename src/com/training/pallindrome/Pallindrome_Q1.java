package com.training.pallindrome;

import java.util.Scanner;

public class Pallindrome_Q1 {

	public static void main(String[] args) {

		int x=0, out=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input: ");

		try 
		{
			int in=scanner.nextInt();
			int m=in;

			while (in>0)
			{
				x=in%10;
				in=in/10;
				out=(out*10)+x;			
			}
			//System.out.println(out);

			if(m==out)
				System.out.println("true");
			else
				System.out.println("false");
		}
		catch (Exception e)
		{
			System.out.println("Please provide valid input values");
		}
		scanner.close();

	}

}
