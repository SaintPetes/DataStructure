/*
 * The purpose of this program is implement a care facility in which patients
 * are sorted in a stack via priority on a 1-10 with 1 being the highest and 10
 * being the lowest. After the patients are sorted and added, a stack of beds
 * is used and assigned to the patients who need it the most. The program then
 * outputs the list of patients along with their bed and location. The programs
 * have been tested for functionality and everything is running smoothly, an
 * excpetion program has been added to make sure the stack does not throw any
 * errors.
 *
 */
package Stacks;
import Queue_List.CasualEmployee;
/**
 *
 * @author Peter Hillar C0416146
 */
public class Patient {

    protected String name;
    protected int priority;
    protected Bed bed;
    protected CasualEmployee casualEmployee;
    /**
     * The default constructor that intializes the variables to null
     */
    public Patient(){
        this.name = "";
        this.priority = 0;
        this.bed = null;
    }
    /**
     * The 2nd constructor of the Patient class that stores a name and priority 
     * of a patient
     * @param name sets name of the patient when the constructor is called
     * @param priority sets the priority/criticality of the patient to help it 
     * get sorted through the stack
     */
    public Patient(String name, int priority ){
        this.name = name;
        this.priority = priority;
        bed = null;
        
    }
    /**
     * 
     * @return gets the name of patient
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param name sets the name of the patient when a new patient is created
     * and allows it to be gathered upon output
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return gets the priority of the patient  
     */
    public int getPriority() {
        return priority;
    }
    /**
     * 
     * @param priority sets the priority of the patient when a new patient is created
     * and allows it to be gathered upon output
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
    /**
     * 
     * @return gets the bed that has been assigned to the Patient
     */
    public Bed getBed() {
        return bed;
    }
    /**
     * 
     * @param bed sets a bed from the bed stack to a patient
     */
    public void setBed(Bed bed) {
        this.bed = bed;
    }
    public void setCasualEmployee(CasualEmployee casualEmployee){
        this.casualEmployee = casualEmployee;
    }
    public CasualEmployee getCasualEmployee(){
        return casualEmployee;
    }
    @Override
    /**
     * The standard output to display the information of a patient that has been
     * added to the stack or newly created
     */
    public String toString(){
        return "The patient: " + name + " is a level " + priority + " priority";
    }
}
