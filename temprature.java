/*
 *temprature.java
 *@author R.Berhe
 *31/01/23
 */
 import java.util.Scanner;
 public class temprature{  //class header
 	public static void main(String args[]){  // main method header
	//print a message to the user
		Scanner keyboard;
		double celsius, fahrenheit;



		//create objects
		keyboard = new Scanner(System.in);
		//input

		System.out.print("Enter the amount in celsius: ");
		celsius= keyboard.nextInt();
			fahrenheit= celsius*9/5+32 ;
		System.out.println("The amount in fahrenheit is " + fahrenheit);
			}
	}