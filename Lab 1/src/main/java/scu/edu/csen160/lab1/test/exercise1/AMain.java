package scu.edu.csen160.lab1.test.exercise1;

public class AMain {
    public static void main(String[] args) {
        // Edit the code, so that the age (in years) of the puppy is printed from main.
        // Edit the code, so that the age (in days) is printed from main.
        Puppy myPuppy = new Puppy("Fido",2);

        System.out.printf("Hello and welcome!");
        System.out.printf("Puppy age in years is: %d\n", myPuppy.getAge()); // calling the method to get the age in years
        System.out.printf("Puppy age in days is: %d\n", myPuppy.getAgeDays()); // calling the method to get the age in days
    }
}