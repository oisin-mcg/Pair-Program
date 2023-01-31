/*
*Date: 31/01/22
*@author:
*Snacks.java
*/

//import of scanner
import java.util.Scanner;

//class definition
public class Snacks{
	public static void main(String args[]){ //main method
	//declare var
	int sweets, crisps, drinks;

	//declare costs
	double costOfSweets= 0.5, costOfDrinks= 2.0, costOfCrisps= 1;
	double totalCost;

	//declare objects
	Scanner keyboard;

	//create objects
	keyboard = new Scanner(System.in);

	//input
	System.out.println("Enter number of sweets: ");
	sweets = keyboard.nextInt();

	System.out.println("Enter number of crisps: ");
	crisps = keyboard.nextInt();

	System.out.println("Enter number of drinks: ");
	drinks = keyboard.nextInt();

	//process
	totalCost= ((sweets*costOfSweets) + (drinks*costOfDrinks) + (crisps*costOfCrisps));
	System.out.println("The cost of your purchase is: " + totalCost);

	}
}