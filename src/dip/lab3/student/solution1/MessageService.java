package dip.lab3.student.solution1;

/**
 *
 * @author Scott
 */
public class MessageService {

    private Input input;
    private Output output;

    public MessageService(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void message() {
        String message = input.readMessage();
        output.writeMessage(message);

    }
}