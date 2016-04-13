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
import Queue_List.LinkedList;
import Queue_List.LinkedQueue;
import Queue_List.CasualEmployee;
import Queue_List.LinearNode;
/**
 *
 * @author C0416146 Peter Hillar
 */
public class StacksMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a new CareFacility known as Jubilee, and is a hospital
        //it uses the stack of patients created and the stack of beds
        CareFacility Jubilee = new CareFacility("Hospital", stackOfPatients(),
            null,null,null);
       Jubilee.sortPatients(stackOfPatients()); //calls the sort function of CareFacility
       Jubilee.assignBed(stackOfPatients(), null);//Assign a bed to a critical patient
        
       //throws an exception once the stack is empty
        try{
            //pops patients who are in need of beds until the bed stack is empty
            //then returns to the patients who did not recieve a bed to the user
            //that they did not recieve a bed
            while(!Jubilee.getPatients().isEmpty()){
                Patient p = Jubilee.getPatients().pop();
                String bed = "No Bed Available";
                if(p.getBed() != null){
                    bed = p.getBed().getName() + " " + p.getBed().getLocation();
                }
                //Out puts the patients name and their bed and location
                String name = p.getName();
                System.out.println(name + "\t" + bed);
            }
        }catch(EmptyCollectionException e){
            System.out.println(e);
        }
        
    }
    /**
     * Creates a stack of 10 patients with varying priority and pushes them into
     * a stack in the order they entered the hospital before sorting them
     * @return gets the stack of patients that is created below and passes it the
     * CareFacility constructor
     */
    private static ArrayStack stackOfPatients(){
    Patient p0 = new Patient ("Jerry Smith", 3);
    Patient p1 = new Patient ("Morty Smith", 9);
    Patient p2 = new Patient ("Saint Petes", 1);
    Patient p3 = new Patient ("Anner Bananer", 1);
    Patient p4 = new Patient ("Robert Lewandowski", 4);
    Patient p5 = new Patient ("Thomas Muller", 8);
    Patient p6 = new Patient ("Mario Gotze", 6);
    Patient p7 = new Patient ("Philip Lahm", 5);
    Patient p8 = new Patient ("Sir Tiny Eyes", 3);
    Patient p9 = new Patient ("Jesus", 10);
    
    
    ArrayStack<Patient> patientStack = new ArrayStack<>();
    patientStack.push(p0);
    patientStack.push(p6);
    patientStack.push(p5);
    patientStack.push(p3);
    patientStack.push(p8);
    patientStack.push(p4);
    patientStack.push(p7);
    patientStack.push(p1);
    patientStack.push(p2);
    patientStack.push(p9);
    
    return patientStack;
}
    /**
     * Creates a stack of beds and assigns the bed a location in the hospital
     * @return gets the stack of beds and passes it to the CareFacility constructor
     * to be assigned to patients who need it
     */
    private static LinkedList<Bed> stackOfBeds(){
        Bed b1 = new Bed("Bed 1","Ward 3");
        Bed b2 = new Bed("Bed 2","Ward 2");
        Bed b3 = new Bed("Bed 3","Ward 1");
        Bed b4 = new Bed("Bed 4","ICU");
        Bed b5 = new Bed("Bed 5","ER");
        
    LinkedList<Bed> bedStack = new LinkedList<>();
    bedStack.addFirst(b1);
    bedStack.addFirst(b2);
    bedStack.addFirst(b3);
    bedStack.addFirst(b4);
    bedStack.addFirst(b5);
    return bedStack;
}
}
