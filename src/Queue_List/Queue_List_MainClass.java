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

import Stacks.CareFacility;
import Stacks.ArrayStack;
import Stacks.Bed;
import Stacks.EmptyCollectionException;
import Stacks.Patient;

/**
 *
 * @author C0416146 Peter Hillar
 */
public class Queue_List_MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            /**
             * Creates two copies of the original patient stack to allow the
             * patients to be displayed before being admitted to a bed and a
             * casual employee or neither or only a bed, the second copy
             * displays their priority
             */
            ArrayStack<Patient> pStack = stackOfPatients().copyStack();
            ArrayStack<Patient> pStack2 = stackOfPatients().copyStack();
            try {
                System.out.println("\n" + "Current Registered Patients " + "\n");
                while (!pStack.isEmpty() && !pStack2.isEmpty()) {
                    System.out.println(" " + pStack.pop().getName() + "\t"
                            + pStack2.pop().getPriority());

                }
            } catch (EmptyCollectionException e) {
                System.out.println(e);
            }
        }
        {
            /**
             * Creates two copies of the original Linked List of beds and
             * displays them for the user to know how many beds they have before
             * they admit patients along with the beds location
             */
            LinkedList<Bed> bList = listOfBeds().copyList();
            LinkedList<Bed> bList2 = listOfBeds().copyList();
            System.out.println("\n" + "Current Beds Available" + "\n");
            while (!bList.isEmpty() && !bList2.isEmpty()) {
                System.out.println(" " + bList.removeLast().getName() + "\t"
                        + bList2.removeLast().getLocation());
            }

        }
        {
            /**
             * Creates a copy of the original Linked Queue of casual employees
             * and displays them for the user to know who is on duty
             */
            LinkedQueue<CasualEmployee> cQueue = queueOfCasual().copyQueue();
            System.out.println("\n" + "Current Casual Employee's On Duty" + "\n");
            try {
                while (!cQueue.isEmpty()) {
                    System.out.println(" " + cQueue.dequeue().getName());
                }
            } catch (Queue_List.EmptyCollectionException ex) {
                System.out.println(ex);
            }
        }
        //Creating a new CareFacility known as Jubilee, and is a hospital
        //it uses the stack of patients created, a list of beds and queue of casual employees
        CareFacility Jubilee = new CareFacility("Hospital", stackOfPatients(),
                listOfBeds(), null, queueOfCasual());
        Jubilee.sortPatients(stackOfPatients()); //calls the sort function of CareFacility
        Jubilee.assignBed(stackOfPatients(), listOfBeds());//Assign a bed to a critical patient
        Jubilee.assignCasualEmployee(stackOfPatients(), queueOfCasual()); //Assigns a casual employee to a critical patient
        //throws an exception once the stack is empty
        System.out.println("\n" + "Current Status of the Jubilee" + "\n");
        try {
            //pops patients who are in need of beds until the bed list is empty
            //then returns to the patients who did not recieve a bed to the user
            //that they did not recieve a bed, then assigns casual employees
            //to the patients who are in need, while letting
            //the user know who did not recieve a casual employee and a bed
            while (!Jubilee.getPatients().isEmpty()) {
                Patient p = Jubilee.getPatients().pop();
                String bed = "No Bed Available";
                String casual = "No Employee Available";
                if (p.getBed() != null) {
                    bed = p.getBed().getName() + " " + p.getBed().getLocation();
                }
                if (p.getCasualEmployee() != null) {
                    casual = p.getCasualEmployee().getName();
                }
                //Out puts the patients name and their bed and location along
                //with a casual employee if theyve been assigned one
                String name = p.getName();
                System.out.println(name + "\t" + bed + "\t" + casual);
            }
        } catch (EmptyCollectionException e) {
            System.out.println(e);
        }

    }

    /**
     * Creates a stack of 10 patients with varying priority and pushes them into
     * a stack in the order they entered the hospital before sorting them
     *
     * @return gets the stack of patients that is created below and passes it
     * the CareFacility constructor
     */
    private static ArrayStack stackOfPatients() {
        Patient p0 = new Patient("Jerry Smith", 3);
        Patient p1 = new Patient("Morty Smith", 9);
        Patient p2 = new Patient("Saint Petes", 1);
        Patient p3 = new Patient("Anner Bananer", 1);
        Patient p4 = new Patient("Bruce Wayne", 4);
        Patient p5 = new Patient("Thomas Muller", 8);
        Patient p6 = new Patient("Mario Gotze", 6);
        Patient p7 = new Patient("Philip Lahm", 5);
        Patient p8 = new Patient("Sir Tiny Eyes", 3);
        Patient p9 = new Patient("Celery Man", 10);

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
     * Creates a linked list of beds and assigns the bed a location in the
     * hospital
     *
     * @return gets the linked list of beds and passes it to the CareFacility
     * constructor to be assigned to patients who need it
     */
    private static LinkedList<Bed> listOfBeds() {
        Bed b1 = new Bed("Bed 1", "Ward 3");
        Bed b2 = new Bed("Bed 2", "Ward 2");
        Bed b3 = new Bed("Bed 3", "Ward 1");
        Bed b4 = new Bed("Bed 4", "ICU");
        Bed b5 = new Bed("Bed 5", "ER");

        LinkedList<Bed> bedList = new LinkedList<>();
        bedList.addFirst(b5);
        bedList.addFirst(b4);
        bedList.addFirst(b3);
        bedList.addFirst(b2);
        bedList.addFirst(b1);
        return bedList;
    }

    /**
     * Creates a Linked Queue of casual employees on duty and inserts them into
     * a queue
     *
     * @return gets the Linked Queue and allows it to be used by other methods
     * within the main method
     */
    private static LinkedQueue<CasualEmployee> queueOfCasual() {
        CasualEmployee c1 = new CasualEmployee("Tim", true);
        CasualEmployee c2 = new CasualEmployee("Eric", true);
        CasualEmployee c3 = new CasualEmployee("Dr Brule", true);

        LinkedQueue<CasualEmployee> casualQueue;
        casualQueue = new LinkedQueue<>();
        casualQueue.enqueue(c1);
        casualQueue.enqueue(c2);
        casualQueue.enqueue(c3);
        return casualQueue;
    }

}
