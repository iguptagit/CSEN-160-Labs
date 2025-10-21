package scu.edu.csen160.lab1.test.exercise7;

public class Exercise7 {
    public static int[] genRandNum(int range, int count){
        // The Math.random() method returns random double numbers
        // in the range >=0.0 to <1.0 .

        // To scale the number to a range of 0-10 for example, we need
        // to multiply it with 10 and cast it to an int to truncate the
        // fractional part.
        int[] arr = new int[count]; // creating an array to hold the random numbers
        for(int i = 0; i < count; i++) {
            int randNum = (int) (range * Math.random()); // generating a random number in the specified range
            arr[i] = randNum; // storing the random number in the array
            System.out.println(randNum);
        }

        //int rand = (int) (10.0 * Math.random());

        // Modify the program such that the method takes 2 parameters, namely,
        // the range and a count of how many numbers to generate in the method.
        // The method generates and prints the count of numbers.
        return arr; // returning the array of random numbers
    }
}
