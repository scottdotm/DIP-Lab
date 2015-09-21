package dip.lab2.student.solution1;
// Imports
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 * Just a test class for input / output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author Scott
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
                
        TipCalculator tip1 = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.GOOD,42);
        TipService tip = new TipService();
        System.out.print("Your Tip = " + "$ " + tip.findTip(tip1));
        
        }  
    }

