package dip.lab3.student.solution1;
/**
 *
 * @author Scott
 */
public class ConsoleOutput implements Output {
    public void writeMessage(String message) {
       System.out.println("Here is the text you entered!");
       System.out.println(message);
    }
}
