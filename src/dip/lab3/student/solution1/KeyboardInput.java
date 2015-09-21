package dip.lab3.student.solution1;
//Import for keyboard
import java.util.Scanner;
/**
 * First Input type 'From Console'
 * @author Scott
 */
public class KeyboardInput implements Input {
    
    public String readMessage() {
       System.out.println(ENTER_MESSAGE);
       
       Scanner userInput = new Scanner(System.in);
        
       return userInput.nextLine();
    }
}