/**
 * 
 */
package Assignment_8;																 // Package Declared
import java.util.Scanner;															 // import scanner class
/**
 * Implement a class that checks whether a given number is a prime using Runnable interface 
 * Print whether a given number is a prime or not. 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
public class PrimeUsingRunnable implements Runnable {								// class declared, Java Thread By Implementing Runnable Interface
	int number;																		// integer variable declared
	PrimeUsingRunnable(int s) { number = s; }
	public void run(){	  															// implementation for run() method
		for(int i=2; i<=number/2; i++){												// for loop to find whether the number is prime or not
			if(number % i == 0){													// if statement
				System.out.println("It's Not Prime Number");						// Print Statement
				break;}																// break statement
	            else{																// else statement
	            	 System.out.println("It's Prime Number");						// Print statement
	            	 break;}														// break statement
	        }   																	// for loop closed
	    }																			// run method closed
	  public static void main(String[] args) {										// Main Method Started
		  int no;																	// integer variable declared
		  Scanner sc = new Scanner(System.in); 										// Scanner to take input from user.
		  	System.out.print("Enter number to check prime : ");					    // Print Statement
			no=sc.nextInt(); 														// Initialize age variable	
			sc.close();																// Close Scanner
			Thread t = new Thread(new PrimeUsingRunnable(no));						// new object created
			t.start();																// Call start() method to start executing the thread object.
		}																			// Main method closed
}																					// class PrimeNumber closed