package dip.lab3.student.solution1;
//Import for GUI
import javax.swing.JOptionPane;
/**
 *
 * @author Scott
 */
public class GUIOutput implements Output {
    
    public void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
