/*
*Date: 31/01/22
*@author:
*Teams.java
*/
//import of scanner
import java.util.Scanner;

//class definition
public class Teams{
	public static void main(String args[]){ //main method
	//declare var
	int NoS, TeamsNo;

	//declare objects
	Scanner keyboard;

	//create objects
	keyboard = new Scanner(System.in);

	//input
	System.out.println("Enter number of Students: ");
	NoS = keyboard.nextInt();

	//process
	TeamsNo = NoS/5;

	System.out.println("Number of teams is " + TeamsNo);

	}
}