package com.training.pallindromeAndSort_Q5;

import java.util.Scanner;

public class PallindromeAndSort_Q5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] wordsArr = new String[20];
		char j;
		String word;
		System.out.println("Enter 10 words: ");
		for(int i=0; i<10; i++)
		{
			wordsArr[i] = scanner.next();	
			System.out.println(wordsArr.length);
		}
		for(int i=0; i<10; i++)
		{
			for(int j=wordsArr.length-1; j>=0; j--)
			{
				wordOut = wordOut + wordsArr.charAt(j);
			}
			arrOut = arrOut + wordOut + " ";
		}
		
	}

}
