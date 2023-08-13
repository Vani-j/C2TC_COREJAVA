public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize a char variable
        char myChar = 'A';

        // Display the char value
        System.out.println("The character is: " + myChar);

        // You can also use Unicode escape sequences
        char unicodeChar = '\u0041';  // Unicode code point for 'A'

        // Display the character represented by Unicode escape sequence
        System.out.println("The Unicode character is: " + unicodeChar);

        // Char can also represent special characters
        char specialChar = '@';
        char sc='#';

        // Display the special character
        System.out.println("The special character is: " + specialChar+" " +sc);
		
	}

}