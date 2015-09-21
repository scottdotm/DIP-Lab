package dip.lab3.student.solution1;
/**
 *
 * @author Scott
 */
public interface Output {
    public final String ENTER_MESSAGE = "Enter your message below and press Return!";
    public final String OUTPUT_MESSAGE = "Here is the text you entered!";
    public abstract void writeMessage(String message);
}