package com.training.d17042018_PhoneBook_Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.training.d17042018_PhoneBook_Q3.User;;

public class controller {

	private final static Logger logger = Logger.getLogger(controller.class.getName());


	public static void main(String args[])
	{
		List<User> user  = new ArrayList<User>();	

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
				User userbook=new User();
				System.out.println("Enter Id");
				String id=sc.next();
				userbook.setPersonId(id);

				System.out.println("Enter FirstName");
				String firstName=sc.next();
				userbook.setFirstName(firstName);
				System.out.println("Enter LastName");
				String lastName=	sc.next();
				userbook.setLastName(lastName);
				System.out.println("Enter Mobile Number ");
				String mobileNumber=sc.next();
				userbook.setMobileNumber(mobileNumber);
				System.out.println("Details Added Succesfully");
				user.add(userbook);
				break;

			case 2:
				System.out.println(" View details of All Person.");

				for(User bean:user)
				{
					System.out.println("Id"+ " "+bean.getPersonId());
					System.out.println("First Name"+ " "+bean.getFirstName());
					System.out.println("Last Name"+" " +bean.getLastName());
					System.out.println("Mobile Number"+" "+bean.getMobileNumber());
				}

				break;
			case 3:
				System.out.println("Enter Mobile  Number to search:");
				String search=sc.next();
				int count=0;

				for(User bean:user)
				{
					if(bean.getMobileNumber().equals(search))
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

				for(User bean:user)
				{
					if(bean.getMobileNumber().equalsIgnoreCase(search1))
					{
						
						count1=user.indexOf(bean);
						
					}
		

				}
				user.remove(count1);
		break;
				
			case 5:
				System.out.println("Thank You!!");
				break;
			}
		}
	}

	}


}


