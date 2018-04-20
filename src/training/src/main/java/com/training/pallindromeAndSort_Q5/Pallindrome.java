
/**
 * @author Pratyush Gupta
 *
 */

package com.training.pallindromeAndSort_Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<String> words = new ArrayList<String>();
		
		try {
			for (int j=0; j<10; j++) 
			{
				System.out.println("Enter a word: ");
				String input = scanner.next();
				String revInput = "";
				for (int i = input.length() - 1; i >= 0; i--) {
					revInput = revInput + input.charAt(i);
				}
				if (input.equalsIgnoreCase(revInput)) {
					System.out.println("Pallindrome");
					words.add(input);
				} else {
					System.out.println("Not a pallindrome");
				} 
			}
			
			for (String s : words) {
				/*words.sort(words.size());*/
				System.out.println(s);
			}
		} 
		catch (Exception e) {
			System.out.println("Please enter valid input");
		}
		
		scanner.close();
	}

}