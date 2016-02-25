/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Esteban
 *
 */
public class HardwoodSeller {

	/**
	 * @param args
	 */

	
	public void readInputFile(String inputFilePath){
		File file = new File(inputFilePath);
		Scanner input = new Scanner(file);
		input.useDelimiter(";");
		String buyer = "";
		String address ="";
		
		//	counters for different wood type
		int cherryCount = 0;
		int curlyMapleCount = 0;
		int genuineMahoganyCount = 0;
		int wengeCount = 0;
		int whiteOakCount = 0;
		int sawdustCount = 0;
		
		
		//	run until file is empty
		while(input.hasNext()){
			buyer = input.next();
			address = input.next();
			date = input.next();
			System.out.println(buyer + address + date);
		}
		
		input.nextLine();		
		
		while (input.hasNext()){
			input.useDelimiter(":");
			
			
		}
	}
	
	public Double deliveryTime(){
		Double deliveryETA = 0.0;
		return deliveryETA;
	}
	
	public static void main(String[] args)  throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		System.out.println("Please ensure the text file is in your project folder ");
		System.out.print("Enter the filename: ");
		String fileName = sc.nextLine();
		readInputFile(fileName);
	}
}
