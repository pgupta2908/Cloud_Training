package com.training.RevereseString_Q2;

import java.util.Scanner;

public class StringReversal_Q2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		String arrOut;
		try {
			System.out.println("Enter a line to reverse words ");
			input = scanner.nextLine();
			System.out.println("Input: \""+input+"\"");

			String[] arrIn = input.split(" ");
			arrOut = "";
			for(int i=0; i<arrIn.length; i++)
			{
				String wordIn = arrIn[i];
				String wordOut = "";
				
				for(int j=wordIn.length()-1; j>=0; j--)
				{
					wordOut = wordOut + wordIn.charAt(j);
				}
				arrOut = arrOut + wordOut + " ";
			}
			arrOut=arrOut.substring(0, arrOut.length()-1);
			System.out.println("Output: \""+arrOut+"\"");
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("String is too long for processing");
		}
		catch (Exception e) {
			System.out.println("Please enter valid values");
		}
		
		scanner.close();

	}

}
