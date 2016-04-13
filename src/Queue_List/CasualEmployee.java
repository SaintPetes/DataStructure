/**
 * 
 * This program creates two types of data, one being a Linked List of Beds, and
 * another being a Linked Queue of Casual Employees. These both interact with the
 * Array Stack of Patients who enter the Care Facility "Jubilee" to be treated.
 * The Patients are taken into the facility with a priority of 1-10, 1 being severe
 * and 10 being a light scratch. They are then assigned a bed and an employee
 * based on their number. However, only 5 beds and 3 employees are their to service
 * their needs. The Hospital outputs the current patients, number of beds, and employees
 * before assigning them all and re-outputting the current status of the Jubilee.
 * 
 */
package Queue_List;

import ADT.HourlyEmployee;


/**
 *
 * @author C0416146 Peter Hillar
 */
public class CasualEmployee extends HourlyEmployee {

    private boolean available;

    /**
     * The first default constructor that initializes hoursWorked, payRate, regularPay
     * and OvertimePay to 0
     */
    public CasualEmployee() {
        hoursWorked = 0;
        payRate = 0.0;
        regularPay = 0.0;
        OvertimePay = 0.0;
    }
    /**
     * The 2nd constructor which creates a casual employee that requires two 
     * parameters
     * @param name the name of the casual employee 
     * @param available the availability of the casual employee so that they may be
     * assigned to a patient
     * 
     */
    public CasualEmployee(String name, boolean available) {
        super();
        this.name = name;
        this.available = available;
    }

    /**
     * Gets the availability of the casual employee
     * @return sees whether or not the casual employee if free or not to be 
     * assigned to a patient
     */
    public boolean getAvailability() {
        return available;
    }
    /**
     * Sets the availability of the casual employee
     * @param avail requires a boolean of true or false in order to set the
     * status of the casual employee and whether or not they can be assigned
     * to a patient
     */
    public void setAvailability(boolean avail) {
        this.available = avail;
    }

    /**
     * The toString of the Casual Employee class
     * @return  the basic output if called upon by the user
     */
    @Override
    public String toString() {
        return ("CasualEmployee " + " available = " + available );
    }
    
}
