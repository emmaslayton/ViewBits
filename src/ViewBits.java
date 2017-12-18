/**"ViewBits"
 *
 * @author emmaslayton
 * Created: 2017
 *
 * Project 17, CSC201-004N
 * Assignment 17.18
 *
 * Program displays the binary digits in the last byte of an user-specified integer
 * Ex: An input of 8 will print out "00001000"
 */

import java.util.Scanner;

public class ViewBits {

    public static void main(String[]args){
        String bits = getBits();
        System.out.println("The last byte of that integer is: " + bits);
    }
    // Displays the bit representation for the last byte, (8 bits), in an integer
    public static String getBits(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int value = input.nextInt();

        String fullBits = ""; // initializes bits string

        // Determine the bits for the user-specified integer
        for ( int i = 0; i < 32; i++) {
            fullBits = (value & 1) + fullBits;
            value >>= 1;
        }

        String bits = fullBits.substring(24);
        return bits;
    }
}
