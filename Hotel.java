/*
 *Hotel.java
 *@author R.Berhe
 *31/01/23
 */
 import java.util.Scanner;
 public class Hotel{  //class header
 	public static void main(String args[]){  // main method header
	//print a message to the user
	Scanner keyboard;
	int noNights, noPeople, costOfStay;
	//create objects
	keyboard= new Scanner(System.in);
	// input
	System.out.println("Enter number of nights: ");
	noNights= keyboard.nextInt();
	System.out.println("Enter number of people: ");
	noPeople= keyboard.nextInt();
	//process
	costOfStay=noNights*noPeople*60;

	System.out.println("The cost of stay is  " +costOfStay);

	}
}


