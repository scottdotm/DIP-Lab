package dip.lab1.student.solution1;

/**
 *
 * @author Scott
 */
public class HourlyPlusIncentiveEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    
    public HourlyPlusIncentiveEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public final double getAnnualIncome() {
        return hourlyRate * totalHrsForYear + 50;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }    
    
    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }
}
