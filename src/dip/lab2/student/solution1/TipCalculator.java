package dip.lab2.student.solution1;
/**
 * @author Scott
 */
public interface TipCalculator {
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    public abstract double getTip();
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
}
