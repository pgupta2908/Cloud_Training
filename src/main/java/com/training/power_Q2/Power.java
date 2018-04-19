package com.training.power_Q2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Power {
	
	static double MyCalculator(int base, int power) throws PowerExceptions
	{
		long answer=0;
		
		if(base<0 || power<0)
		{
			throw new PowerExceptions("base or power should not be negative");
		}
		
		else if(base==0 && power==0)
		{
			throw new PowerExceptions("base and power cannot be 0");
		}
		
		else if(base>9 || power>9)
		{
			throw new PowerExceptions("base and power cannot be greater than 9");
		}
		
		/*else
		{
			answer=Math.pow(base, power);
			
			System.out.println(answer);
		}*/
		
		else
		{
			answer=base;
			for (int i=0; i<power-1; i++)
			{
				answer=answer*base;
			}
			System.out.println(answer);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws PowerExceptions {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter value of base and power:");
		
		int base;
		int power;
		try 
		{
			base=scanner.nextInt();
			power=scanner.nextInt();
			MyCalculator(base, power);
		} 
		catch (InputMismatchException e) {
			System.out.println(e+ " base or power should be integers only");
		}
		
		scanner.close();
	}
			
}


