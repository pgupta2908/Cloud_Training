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
			char[] in = input.toCharArray();
			System.out.println(in);

			if (input.length()<=2)
				System.out.println("input is wrongly entered, please enter atleast 3 characters");

			else 
			{
				for(int i=0; i<input.length()-1; i++)
				{

					if((i==0) || (i>0 && i<input.length()-2))
					{
						while (in[i] == in[i + 1]) 
						{
							if (in[i] == in[i+1]) 
							{
								temp=in[i];
								in[i] = in[i+1];
								//	in[i+1]=temp;
								in[i+1]=in[i+2];
								in[i+2]=temp;
								System.out.println("aa");
								
							} 
							else
								continue;

						}
					}

					else if(i==input.length()-2)
					{
						while (in[i] == in[i+1]) 
						{
							if (in[i] == in[i+1]) 
							{
								temp = in[i];
								in[i] = in[i+1];
								//	in[i] = temp;
								in[i+1] = in[i-1];
							} 
							else
								continue;
						}
					}
					System.out.println(in);
				}	 
			}
			/*String xy = in.toString();
			if(word.equalsIgnoreCase(xy))
			{
				System.out.println("\"true");
			}
			else
			{
				System.out.println("\"input false\"");
			}*/

		} 
		catch (Exception e) {
			System.out.println("Faced an error, please retry");
		}
		scanner.close();
	}

}
