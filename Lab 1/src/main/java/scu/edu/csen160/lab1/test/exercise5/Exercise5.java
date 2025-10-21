package scu.edu.csen160.lab1.test.exercise5;

import java.util.Scanner;
import scu.edu.csen160.lab1.test.exercise4.ScannerDemo;

public class Exercise5 {
    public static void main(String[] args) {
        tester();
    }
	public static boolean isItALeapYear(int year){
		// This method should check if the parameter year is a leap year and return a true.
		// Otherwise a false.
        if(year%400==0) return true; // checking if year is divisible by 400
        if(year%4==0 && year%100!=0) return true; // checking if year is divisible by 4 and not by 100
		// A leap year is a year that is divisible by 4 and not by hundred  OR
		// it is divisible by 400.

		// Complete the code segment. Fix any errors in the method signature.
        return false;
	}

    public static void tester(){
        Scanner input = new Scanner(System.in); // Creating a Scanner object to read input
        System.out.println("Enter a year to check if it is a leap year:");
        int year = input.nextInt(); // reading the year from user and storing it in a variable called year
        if(isItALeapYear(year)){ // calling the method to check if it is a leap year
            System.out.printf("%d is a leap year!\n", year);
        }
        else {
            System.out.printf("%d is not a leap year!\n", year);
        }
    }
}