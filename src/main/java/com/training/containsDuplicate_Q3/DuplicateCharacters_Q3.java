
/**
 * @author Pratyush Gupta
 *
 */

package com.training.containsDuplicate_Q3;

import java.util.Scanner;

public class DuplicateCharacters_Q3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int flag = 0;

		try {
			String wordOut = "";
			String input=scanner.nextLine();
			String[] words = input.split(" ");
			for (int i=0; i<words.length; i++)
			{
				wordOut=wordOut+words[i];
			}


			for(int i=0; i<wordOut.length(); i++)
			{
				for(int j=0; j<wordOut.length(); j++)
				{
					if(wordOut.charAt(i)==wordOut.charAt(j))
						flag++;
					else
						continue;
				}
				if(flag>wordOut.length())
				{
					System.out.println("true");
					break;
				}
			}

			if(flag<=wordOut.length())
			{
				System.out.println("false");
			} 
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Input is too large to handle");
		}
		catch (Exception e) {
			System.out.println("Please retry with valid values");
		}

		scanner.close();
	}

}