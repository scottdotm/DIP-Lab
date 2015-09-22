package dip.lab3.student.solution1;
//Import for keyboard
import java.util.Scanner;
/**
 * First Input type 'From Console'
 * @author Scott
 */
public class ConsoleInput implements Input {
    
    public String readMessage() {
       System.out.println("Enter your message below and press Return!");
       
       Scanner userInput = new Scanner(System.in);
        
       return userInput.nextLine();
    }
}