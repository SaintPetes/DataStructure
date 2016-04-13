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
public class Company {

    public static HourlyEmployee[] hourlyEmployee;
    public static FullTimeEmployee[] fullTimeEmployee;

    /**
     * The default constructor of Company
     */
    public Company() {

    }

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
    //Company company = new Company();
    //company.run();
    //FullTimeEmployee topPaidHour = company.findBestPaid(hourlyEmployee);
    //System.out.println(company.outPut(topPaidHour));
    //FullTimeEmployee topPaidFull = company.findBestPaid(fullTimeEmployee);
    // System.out.println(company.outPut(topPaidFull));
    //}
    /**
     * This function is the hourly employee array and the full time employee
     * array that gets run via the Main Company class.
     */
    public void run() {
        hourlyEmployee = new HourlyEmployee[10];
        hourlyEmployee[0] = new HourlyEmployee("Simon Hukket", 2304, 18.50);
        hourlyEmployee[1] = new HourlyEmployee("Jerhn Whalewolf", 2303, 18.51);
        hourlyEmployee[2] = new HourlyEmployee("Mergen Freedaman", 1000, 16.00);
        hourlyEmployee[3] = new HourlyEmployee("Perder Hillier", 3000, 22.50);
        hourlyEmployee[4] = new HourlyEmployee("Roofus Chowder", 2222, 22.22);
        hourlyEmployee[5] = new HourlyEmployee("Jen Jen", 356, 11.11);
        hourlyEmployee[6] = new HourlyEmployee("Magnets Einstern", 10000, 1.25);
        hourlyEmployee[7] = new HourlyEmployee("Unit Simon", 99999, 0.10);
        hourlyEmployee[8] = new HourlyEmployee("Rick Sanchez", 7500, 0.50);
        hourlyEmployee[9] = new HourlyEmployee("Morty Smith", 399, 12.20);

        fullTimeEmployee = new FullTimeEmployee[3];
        fullTimeEmployee[0] = new FullTimeEmployee("Lord Rupert", 50000000);
        fullTimeEmployee[1] = new FullTimeEmployee("Ronnie Pickering", 7850);
        fullTimeEmployee[2] = new FullTimeEmployee("Snoop Dog", 125000);

    }

    /**
     * The purpose of this function is to find the best paid employee for both
     * full time and part time employees.
     *
     * @param employeeArray searches the array for the highest paid employee
     * @return topPaid employee from either array when asked
     */
    public FullTimeEmployee findBestPaid(FullTimeEmployee[] employeeArray) {
        FullTimeEmployee topPaid = employeeArray[0];
        for (FullTimeEmployee employee : employeeArray) {
            if (employee.grossPay > topPaid.grossPay) {
                topPaid = employee;
            }
        }
        return topPaid;

    }

}
