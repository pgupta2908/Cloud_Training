
/**
 * @author Pratyush Gupta
 *
 */

package com.training.d17042018_PhoneBook_Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.training.d17042018_PhoneBook_Q3.User;;

public class controller {

	public static void main(String args[])
	{
		List<User> phoneBook  = new ArrayList<User>();	

		while(true)
		{

			System.out.println("###################################");
			System.out.println("1. Add a Person.");
			System.out.println("2. View details of All Person.");
			System.out.println("3. Search a Person.");
			System.out.println("4. Remove a Person.");
			System.out.println("5. Exit");
			System.out.println("###################################");
			System.out.println("Enter a choice please: ");
			System.out.println("###################################");
			
			Scanner sc=new Scanner(System.in);
			int choice =sc.nextInt();
			if(choice<1 || choice >5)
			{
				System.out.println("Choice out of range. Try again");
				continue;
			}
			else
			{
			switch(choice)
			{
			case 1:
				User user=new User();
				System.out.println("Enter Id");
				String id=sc.next();
				user.setPersonId(id);

				System.out.println("Enter FirstName");
				String firstName=sc.next();
				user.setFirstName(firstName);
				System.out.println("Enter LastName");
				String lastName=	sc.next();
				user.setLastName(lastName);
				System.out.println("Enter Mobile Number ");
				String mobileNumber=sc.next();
				user.setMobileNumber(mobileNumber);
				System.out.println("Details Added Succesfully");
				phoneBook.add(user);
				break;

			case 2:
				System.out.println(" View details of All Person.");

				for(User user1:phoneBook)
				{
					System.out.println("Id"+ " "+user1.getPersonId());
					System.out.println("First Name"+ " "+user1.getFirstName());
					System.out.println("Last Name"+" " +user1.getLastName());
					System.out.println("Mobile Number"+" "+user1.getMobileNumber());
				}

				break;
			case 3:
				System.out.println("Enter Mobile  Number to search:");
				String search=sc.next();
				int count=0;

				for(User user1:phoneBook)
				{
					if(user1.getMobileNumber().equals(search))
					{
						count=1;
						
					}
				}
				if (count!=0)
				{
					System.out.println("Person Found");
				}
				else
				{
					System.out.println("No Person found");
				}



				break;
				
			case 4:
				
				System.out.println("Enter Mobile  Number to remove:");
				String search1=sc.next();
				int count1=-1;

				for(User user1:phoneBook)
				{
					if(user1.getMobileNumber().equalsIgnoreCase(search1))
					{
						
						count1=phoneBook.indexOf(user1);
						
					}
		

				}
				phoneBook.remove(count1);
		break;
				
			case 5:
				System.out.println("Thank You!!");
				break;
			}
		}
	}

	}


}


