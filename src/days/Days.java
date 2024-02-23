/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;


/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */

public class Days {

    // Define the Day enum inside the Days class, but outside any method
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Iterate over the values of the Day enum and print each one
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

