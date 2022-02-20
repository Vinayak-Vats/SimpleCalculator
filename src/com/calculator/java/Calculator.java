/**
 * 
 */
package com.calculator.java;
import java.util.Scanner;
/**
 * @author Vinayak
 *This is a calculator created for you to make your day to day calculations easy
 *For more efficiency, productivity and reliability
 *Takes user input in console
 *Translates strings to numerical value
 *Executes addition mathematical operation
 *Returns result to the console
 */
public class Calculator {
	public static void main(String[]args) {
		System.out.println("Pure mathematics is, in its way, the poetry of logical ideas —Albert Einstein");
		
		Scanner sc= new Scanner(System.in);              // Scanner class will allow user to give input via console          
		System.out.println("Enter First number: ");
		String numOne= sc.nextLine();
		System.out.println("Enter Second number: ");
		String numTwo= sc.nextLine();
		
		double newOne= Double.parseDouble(numOne);       //Here we are converting the string(given by user as input) into Double  
		double newTwo= Double.parseDouble(numTwo);
		double numThree=(newOne+newTwo);				 //Assigning new variable of type double to store added value of numThree & numFour 
		
		System.out.println("Result Obtained: "+ numThree+"\nThank You for using my calculator");					
	}
}
