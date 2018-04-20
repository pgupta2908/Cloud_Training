
/**
 * @author Pratyush Gupta
 *
 */

package com.training.d17042018_ReorganizeString_Q1;

import java.util.Scanner;


public class ReorganizeString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char temp;

		System.out.println("Please enter a character string for rearrangement");

		try 
		{
			String input = scanner.next();
			char[] charIn = input.toCharArray();
			System.out.println(charIn);

			if (input.length()<=2)
				System.out.println("input is wrongly entered, please enter atleast 3 characters");

			else 
			{
				for(int i=0; i<input.length()-1; i++)
				{

					if((i==0) || (i>0 && i<input.length()-2))
					{
						while (charIn[i] == charIn[i + 1]) 
						{
							if (charIn[i] == charIn[i+1]) 
							{
								temp=charIn[i];
								charIn[i] = charIn[i+1];
								charIn[i+1]=charIn[i+2];
								charIn[i+2]=temp;
								System.out.println("aa");
								
							} 
							else
								continue;

						}
					}

					else if(i==input.length()-2)
					{
						while (charIn[i] == charIn[i+1]) 
						{
							if (charIn[i] == charIn[i+1]) 
							{
								temp = charIn[i];
								charIn[i] = charIn[i+1];
								charIn[i+1] = charIn[i-1];
							} 
							else
								continue;
						}
					}
					System.out.println(charIn);
				}	 
			}

		} 
		catch (Exception e) {
			System.out.println("Faced an error, please retry");
		}
		scanner.close();
	}

}