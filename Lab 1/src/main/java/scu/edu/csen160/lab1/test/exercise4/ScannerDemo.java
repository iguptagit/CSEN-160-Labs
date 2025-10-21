package scu.edu.csen160.lab1.test.exercise4;

import java.util.Scanner;

public class ScannerDemo{
    private int i;
    private float v;
    private double v1;
	public static void main(String[] args) {
		// Declarations
		Scanner in = new Scanner(System.in);
		int anInteger;
		float aFloat;
		double aDoubleNumber;

		// Prompts
		System.out.println("Enter an integer");
		anInteger = in.nextInt();
		
		System.out.println("Enter a float");
		aFloat =  in.nextFloat();

		System.out.println("Enter a double");
		aDoubleNumber = in.nextDouble();
		// Output the user input

		System.out.println("Here is what you entered: ");
		System.out.println(anInteger);
		System.out.println(aFloat);
		System.out.println(aDoubleNumber);
		
		in.close();
	}

    public void setAnInteger(int i) {
        this.i = i; // setting the value of instance variable i
    }

    public void setaFloat(float v) {
        this.v = v; // setting the value of instance variable v
    }

    public void setaDoubleNumber(double v1) {
        this.v1 = v1; // setting the value of instance variable v1
    }

    public int getAnInteger() {
        return this.i; // returning the value of instance variable i
    }

    public float getaFloat() {
        return this.v; // returning the value of instance variable v
    }

    public double getaDoubleNumber() {
        return this.v1; // returning the value of instance variable v1
    }
}