package scu.edu.csen160.lab1.test.exercise5;

public class AMain {
    public static void main(String[] args) {
            // Insert code to check, by calling the method you have written,
            //  if the following years are leap years or not.
            // 1716,1989, 1992, 2000, 2010, 2012.
            int[] years = {1716, 1989, 1992, 2000, 2010, 2012};
            for(int i=0; i<years.length; i++){
                if(Exercise5.isItALeapYear(years[i])){
                    System.out.printf("%d is a leap year!\n", years[i]);
                }
                else {
                    System.out.printf("%d is not a leap year!\n", years[i]);
                }
            }
            // Test your code with other years of your choice.
            // This is a blub
    }
}
