package dip.lab3.student.solution1;
/**
 *
 * @author Scott
 */
public class Startup {

    public static void main(String[] args) {

        Input input = new ConsoleInput();
        Output output = new ConsoleOutput();

        MessageService message = new MessageService(input, output);


        message.message();

    }
}