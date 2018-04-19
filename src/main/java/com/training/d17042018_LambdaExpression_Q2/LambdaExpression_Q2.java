
/**
 * @author Pratyush Gupta
 *
 */

package com.training.d17042018_LambdaExpression_Q2;

public class LambdaExpression_Q2 {

	interface CheckOdd {
		public boolean isOdd(int number);
	}

	interface CheckPrime {
		public boolean isPrime(int number);
	}

	interface CheckPalindrome {
		public boolean isPalindrome(int number);
	}

	public static void main(String[] args) 
	{

		int num = 11;  

		CheckOdd check1 = (number)->{  
			if(num%2 == 0)
				return false;
			else return true;
		};  
		System.out.println("num is odd : "+check1.isOdd(num));  

		CheckPrime prime1 = (number)->{  
			for(int i = 2; i <= num/2; i++)      
			{
				if(num%i == 0)
					return false;
			}
			return true;
		};
		System.out.println("num is prime : "+prime1.isPrime(num));

		
		CheckPalindrome  palindrome1 = (number) -> {
			int temp = 0, remainder = 0, reverse = 0;;
			int duplicate = number; 
			while (number > 0)
			{
				
				remainder = number % 10;
				number = number / 10;
				reverse = reverse * 10 + remainder;
				temp = reverse;
			}
				if (duplicate == temp)
					return true;
				else 
					return false;

		};
		
		System.out.println("num is palindrome : " + palindrome1.isPalindrome(num));
	}

}