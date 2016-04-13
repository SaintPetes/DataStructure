/**
 * The purpose of this program is to create to two subclasses that use the 
 * Employee interface which allows the classes, FullTimeEmployee and HourlyEmployee
 * to have certain functions, so that a main class, known as Company can keep
 * track of the highest paid employee, with both the FullTimeEmployee's and 
 * HourlyEmployees stored in an array, all the classes are tested for functionality
 * so that no problems occur in the running of the programs, and if a program does
 * occur it is shown.
 */
package ADT;

/**
 *
 * @author Peter Hillar C0416146
 */
public class HourlyEmployee extends FullTimeEmployee{

    protected int hoursWorked;
    protected double payRate;
    protected double regularPay;
    protected double OvertimePay;

    /**
     * This is the default constructor
     */
    public HourlyEmployee() {
        hoursWorked = 0;
        payRate = 0.0;
        regularPay = 0.0;
        OvertimePay = 0.0;

    }

    /**
     * This constructor contains the name, # of hours worked, and how much the
     * hourly employee makes
     *
     * @param name the name of the hourly employee
     * @param hoursWorked the number of hours the hourly employee has worked
     * @param payRate how much the hourly employee makes per hour
     */
    public HourlyEmployee(String name, int hoursWorked, double payRate) {
        super(name, hoursWorked * payRate);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    /**
     * This method gets the number hours worked by the hourly employee
     *
     * @return the number of hours worked by the employee
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * This method gets the pay rate of the hourly employee
     *
     * @return the payRate of the hourly employee
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * This method gets the hourly workers total regular pay
     *
     * @return the regular pay of the hourly employee
     */
    public double getRegularPay() {
        return regularPay;
    }

    /**
     * This method gets the overtime pay amount of the hourly employee
     *
     * @return the overtime pay of the hourly employee
     */
    public double getOvertimePay() {
        return OvertimePay;
    }

    /**
     * This toString contains the output information for an hourly employee
     *
     * @return toString of the Hourly Employee
     */
    public String toString() {
        return "HourlyEmployee" + "\n Hours Worked = " + hoursWorked
                + "\n Pay Rate = " + payRate + "\n Regular Pay = " + regularPay
                + "\n Overtime Pay = " + OvertimePay;
    }

}
