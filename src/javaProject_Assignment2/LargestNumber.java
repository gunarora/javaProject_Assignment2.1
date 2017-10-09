//Print the highest number and the output should be displayed on the eclipse console.
package javaProject_Assignment2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int x,y,z;
		
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		//Input three numbers
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		//Conditions to get highest number
		if(x >= y && x >= z)
		{
			System.out.println("Largest number is " + x);
		}
		else if (y >= x && y >= z)
		{
			System.out.println("Largest number is " + y );
		}
		else
		{
			System.out.println("Largest number is "  + z);
		}
		
		sc.close();
		

	}

}
