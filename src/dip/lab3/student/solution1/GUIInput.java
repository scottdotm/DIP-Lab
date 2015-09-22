package dip.lab3.student.solution1;
// GUI import
import javax.swing.JOptionPane;
/**
 *
 * @author Scott
 */
public class GUIInput implements Input {
    private String guiMessage;
    public String readMessage() {
        guiMessage = JOptionPane.showInputDialog(null, "Enter your message below and press Return!");
        
      return guiMessage;
    }
}