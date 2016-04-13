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
public class FullTimeEmployee implements Employee {

    protected String name;
    protected double grossPay;

    /**
     * This is the default constructor of the full time employee
     */
    public FullTimeEmployee() {
        name = null;
        grossPay = 0.0;
    }

    /**
     * This function requires the name and the grosspay of the full time
     * employee
     *
     * @param name this is the name of full time employee
     * @param grossPay this is the grossPay of the full time employee
     */
    public FullTimeEmployee(String name, double grossPay) {
        this();
        this.grossPay = grossPay;
        this.name = name;
    }

    /**
     * This is the getter for gathering the name of the full time employee
     *
     * @return the name of full time employee
     */
    public String getName() {
        return name;
    }

    /**
     * This is the getter for gross pay of the full time employee
     *
     * @return the grossPay of the full time employee
     */
    public double getGrossPay() {
        return grossPay;

    }

    /**
     * This is the toString which outputs the full time employees information
     *
     * @return toString of the FullTimeEmployee
     */
    public String toString() {
        return "FullTimeEmployee" + "\n Full Time Employee Name = " + name
                + "\n Gross Pay = " + grossPay;
    }

}
