/*
*Tables.java
*@author O.McGillicuddy
*24/1/23
*/

public class Tables{
	public static void main(String args[]){
		System.out.println("|Times tables|");
		for (int i = 1; i <= 12; i++) {
			for (int v = 1; v <= 12; v++)
			System.out.println(i + " times " + v + " is " + (i*v));
}
	}
}