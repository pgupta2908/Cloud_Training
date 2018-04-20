package com.training.d19042018_inputOutput_Q1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputOutput_Q1<T> {

	public static <T> void main(String[] args) 
	{


		Scanner scanner = new Scanner (System.in);
		List<T> list = new ArrayList<>();
		int count=0;

		System.out.print("Enter the number of values you want to enter: ");

		try
		{
			count=scanner.nextInt();

			System.out.println("Input:");
			for (int i = 0; i < count; i++) 
			{
				T value = (T) scanner.next();
				list.add(value);
			} 
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input, please try again");
		}
		
		scanner.close();
		printOutput(list);
	} 



	public static <T> List<T> printOutput(List<T> list)
	{
		System.out.println("Output:");
		/*for (T t : list) 
		{
			System.out.println(t);
		}*/
		return list;
	}
}


