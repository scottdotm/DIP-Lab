package dip.lab1.student.solution1;
/**
 *
 * @author Scott
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    
    public double getAnnualIncome() {
        return annualSalary + annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
}