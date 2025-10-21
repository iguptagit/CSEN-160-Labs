package scu.edu.csen160.lab1.test.exercise3;

public class PatternMaker {
    public static String drawOneLine(char symbol, int noOfTimes, int
            offset){

        StringBuilder sb = new StringBuilder(); // Create a StringBuilder to combine the output
        System.out.println();
        for (int j = 0; j < offset; j++) {
            sb.append(" "); // appending a blank space
            System.out.print(" ");
        }
        for (int i = 0; i <noOfTimes; i++) {
            sb.append(symbol); // appending the symbol to the output
            System.out.print(symbol);
        }
        sb.append("\n");
        // Write Java code to draw the symbol for the noOfTimes
        // after drawing a number of blankspaces (offset) .
        // For example, if the symbol is "*", noOfTimes is 10
        // and offset is 3,it should draw 3 blank spaces and
        // then draw 10 stars.
        //System.out.println(); // Print new line.
        // Write a for – loop to draw offset number of blank spaces.
        // for example, if offset is 3, it should draw 3 blank
        // spaces. Use System.out.print(" ") to print a single
        // blank space. Write a for – loop to draw the symbol,
        // the noOfTimes.
        return sb.toString(); // returning the combined output as a string
    }
    public static String drawPattern() {
        StringBuilder finals = new StringBuilder(); // Create a StringBuilder to combine the output
        finals.append(drawOneLine('*', 4, 4));
        finals.append(drawOneLine('*', 8, 8));
        finals.append(drawOneLine('*', 12, 12));
        // This method should draw the following pattern:
        // 1. line, should have 4 blank spaces followed by 4 stars.
        // 2. line will have 8 blank spaces followed by 8 stars.
        // 3. line will have 12 blank spaces followed by 12 stars.
        // ****
        // ********
        // ************
        // The method should call the method, drawOneLine()
        //
        return finals.toString(); // returning the combined output as a string
    }
}
