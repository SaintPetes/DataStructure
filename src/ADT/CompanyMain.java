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

import static ADT.Company.fullTimeEmployee;
import static ADT.Company.hourlyEmployee;

/**
 *
 * @author Peter Hillar C0416146
 */
public class CompanyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Company company = new Company();
       company.run();
       FullTimeEmployee topPaidHour = company.findBestPaid(hourlyEmployee);
       System.out.println(" The best paid Hourly employee is " + topPaidHour.getName()+ " $"+ 
                (topPaidHour.getGrossPay()) +"\n");
       FullTimeEmployee topPaidFull = company.findBestPaid(fullTimeEmployee);
       System.out.println(" The best paid Full Time employee is " + topPaidFull.getName()+ " $"+ 
                (topPaidFull.getGrossPay()) +"\n");
    }
    
}
