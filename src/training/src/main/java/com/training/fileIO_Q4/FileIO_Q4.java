
/**
 * @author Pratyush Gupta
 *
 */

package com.training.fileIO_Q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO_Q4 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.flush();
		System.out.print("Enter a file name: ");	
		
		try {
			String filename=scanner.nextLine();	

			File inputfile=new File(filename);	
			Scanner input = new Scanner(inputfile);

			File outputfile=new File("output.txt");	
			PrintWriter writer = new PrintWriter(outputfile);	

			String output="";	
			while(input.hasNextLine())	
			{
				output = input.nextLine();	
				writer.println(output);	
			}
			input.close();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch (Exception e) {
			System.out.println("Some error faced, please retry");
		}
		finally {
			scanner.close();
		}

	}

}