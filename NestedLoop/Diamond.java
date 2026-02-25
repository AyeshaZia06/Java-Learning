import java.util.Scanner;   

class Oop {
    public static void main(String args[]) {

        // Upper half of the diamond
        for (int i = 1; i <= 5; i++) {   // Controls number of rows (1 to 5)

            // Print spaces before stars
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = 4; i >= 1; i--) {   // Controls rows from 4 down to 1

            // Print spaces before stars
            for (int k = 1; k <= ((4 - i) + 1); k++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
