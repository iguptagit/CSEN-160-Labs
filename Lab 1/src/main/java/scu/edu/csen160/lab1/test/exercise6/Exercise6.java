package scu.edu.csen160.lab1.test.exercise6;

public class Exercise6 {
	public static String fullName(String firstName, String middleName, String lastName){
		// Create a string for full name as lastName, firstName,first letter of
		// middle name followed by a . (dot). The first initials of first and last
		// names and the middle initial should be in upper case and the rest in lower
		// case.
        StringBuilder fname = new StringBuilder();
        fname.append(lastName.substring(0, 1).toUpperCase());
        fname.append(lastName.substring(1).toLowerCase());
        fname.append(", ");
        fname.append(firstName.substring(0, 1).toUpperCase());
        fname.append(firstName.substring(1).toLowerCase());
        fname.append(" ");
        fname.append(middleName.substring(0, 1).toUpperCase());
        fname.append(".");
        return fname.toString();
		// For example, Robert (first), alan (middle) and Smith (last) should be
		// written as Smith, Robert A.
		// Return the full name.
	}

	public static boolean palindrome(String text){
		// check if text is a palindrome and return a true if it is and
		// false otherwise.
        String original = text; // original text
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // removing non-alphanumeric characters and converting to lower case
        StringBuffer temp = new StringBuffer(cleaned); // creating a StringBuffer to reverse the cleaned text
        String reversed = temp.reverse().toString(); // reversing the cleaned text
        if (cleaned.equals(reversed)) { // checking if cleaned text is equal to reversed text for the final palindrome check
            return true;
        }

        return false;
	}
}