/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameofcity;

import java.util.Scanner;

/**
 *
 * @author Jean-Luc
 */
public class NameOfCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the user's favorite city.
    System.out.print("Enter the name of your favorite city: ");
    
    String city = keyboard.nextLine();

    // close stream
    keyboard.close();
    
    // The number of characters in the city name.
    System.out.println("Number of characters: " + city.length());

    // The name of the city in all uppercase letters.
    System.out.println(city.toUpperCase());

    // The name of the city in all lowercase letters.
    System.out.println(city.toLowerCase());

    // The first character in the name of the city.
    System.out.println(city.charAt(0));
    }
    
}
