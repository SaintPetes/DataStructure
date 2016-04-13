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
public interface Employee {
    public String getName();
    public double getGrossPay();
    public String toString();
   
    
}
