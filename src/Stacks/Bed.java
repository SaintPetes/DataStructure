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

/**
 *
 * @author Peter Hillar C0416146
 */
public class Bed {

    protected String name;
    protected String location;
    
    /**
     * The first constructor of Bed that requires a name and location before creating
     * the bed
     * @param name stores the name of the bed
     * @param location stores the location of the bed
     */
    public Bed(String name, String location){
        this.name = name;
        this.location = location;
        
    }
    /**
     * Gets the name of the bed that is assigned to the patient/bed stack
     * @return the name of the bed
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param name sets the name of the bed to be gathered later when output
     * is required
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the location of the bed that is assigned to the patient/bed stack
     * @return the location of the bed
     */
    public String getLocation(){
        return location;
    }
    /**
     * 
     * @param location sets the location of the bed to be gathered later when
     * output is required
     */
    public void setLocation(String location){
        this.location = location;
    }
    @Override
    /**
     * Has the output of the bed when called upon to display for the user
     */
   public String toString(){
       return "Bed: "+ name + " is currently in " + location;
   }
}
