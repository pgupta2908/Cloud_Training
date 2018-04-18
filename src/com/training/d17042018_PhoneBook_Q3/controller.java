package com.training.d17042018_PhoneBook_Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class controller {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<User> list = new ArrayList<User>();
		while (true) 
		{
			
			System.out.println("################################");
			System.out.println("------------Phonebook-----------");
			System.out.println("1. add data");
			System.out.println("2. remove data");
			System.out.println("3. search by name");
			System.out.println("4. search by number");
			System.out.println("5. search by sr no");
			System.out.println("--------------------------------");
			System.out.println("################################");
			int option = scanner.nextInt();
			switch (option) {
				case 1: {
					User record = new User();
	
					System.out.println("Please enter id of the record");
					int id = scanner.nextInt();
					record.setId(id);
	
					System.out.println("Please enter first name of the record");
					String fName = scanner.next();
					record.setfName(fName);
	
					System.out.println("Please enter last name of the record");
					String lName = scanner.next();
					record.setlName(lName);
	
					System.out.println("Please enter phone number of the record");
					String phone = scanner.next();
					record.setPhone(phone);
	
					list.add(record);
	
				}
	
				case 2: {
					System.out.println("Please enter the id of the record you want to delete");
					int sId= scanner.nextInt();
				}
	
				case 3: {
					System.out.println("Please enter the name to search record");
				}
	
				case 4: {
					System.out.println("Please enter the number to search a record");
				}
	
				case 5: {
					System.out.println("Please enter the serial number of record to search");
				}
	
				default: {
					System.out.println("Please provide a valid input");
				}
				//scanner.close();
			}
		}
		
	}
}
