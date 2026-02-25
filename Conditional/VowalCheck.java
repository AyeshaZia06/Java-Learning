import java.util.Scanner;  // Import Scanner class to take user input

class P2 {
    public static void main(String args[]) {

        char alphabet;  // Declare a character variable to store the input letter

        System.out.print("Enter a alphabet:");  // Prompt user to enter a letter

        Scanner input = new Scanner(System.in);  // Create Scanner object for input

        alphabet = input.next().charAt(0);  
        // Read the first character entered by the user

        // Check if the entered character is a lowercase vowel
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || 
            alphabet == 'o' || alphabet == 'u') {

            System.out.print(alphabet + " is a vowel.");  // If true, print vowel message
        }
        else {
            System.out.print(alphabet + " is not a vowel.");  
            // If false, print not vowel message
        }

        input.close();  // Close the Scanner to prevent resource leak
    }
}
