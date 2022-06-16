package dip.lab3.student.solution1;
/**
 *
 * @author Scott
 */
public class MessageService {

    private final Input input;
    private final Output output;

    public MessageService(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void message() {
        String message = input.readMessage();
        output.writeMessage(message);

    }
}