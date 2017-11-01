/**
 * 
 */
package Assignment_8;																		// Package declared 
import java.util.Scanner;																	// import scanner class
/**
 * Implement a class that checks whether a given number is a prime using Thread class.
 * Print whether a given number is a prime or not. 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
public class PrimeUsingThread extends Thread{												// class declared with extension Thread. A thread can be created in java by extending Thread class.
	int number;																			    // Integer variable declared
	PrimeUsingThread(int s) { number = s; }
	public void run()	{	  																// implementation for run() method
		 for(int i=2; i<=number/2; i++){												    // for loop to find whether the number is prime or not
	            if(number % i == 0){														// if statement
	            	System.out.println("It's Not Prime Number");							// print statement
	            	break;}																	// break statement
	            else{																		// else statement
	            	 System.out.println("It's Prime Number");								// print statement
	            	 break;}																// break statement
	        }  																				// for loop closed
	    }																					// run() method closed
	public static void main(String[] args) {												// main method started
		 int no;																			// Integer variable declared
		 Scanner sc = new Scanner(System.in); 												// Scanner to take input from user.
		 System.out.print("Enter number to check prime : ");								// Print the value
		 no=sc.nextInt(); 																	// Initialize age variable	
		 sc.close();																		// Close Scanner
		 Thread thread = new Thread(new PrimeUsingThread(no));								// new object created
		 thread.start();																	// Call start() method to start executing the thread object.
	}																			            // Main method closed
}																					        // class PrimeNumber closed
