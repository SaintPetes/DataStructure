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

/**
 *
 * @author C0416146 Peter Hillar
 */
public class LinearNode<T> {
    protected T element;
    protected LinearNode<T> next;
    /**
     * The default LinearNode constructor that initializes everything to null
     */
    public LinearNode(){
        element = null;
        next = null;
    }
    /**
     * The 2nd constructor of LinearNode, takes the parameters of element, in
     * order to be placed within a linked list or linked queue
     * @param elem the data that will be stored within Linked List or Linked Queue
     */
    public LinearNode(T elem){
        next = null;
        element = elem;
    }
    /**
     * Gets the next LinearNode when asked by the user
     * @return the data within the next data node
     */
    public LinearNode<T> getNext(){
        return next;
    }
    /**
     * Sets the data stored within the next node to what the user wants
     * @param node requires a node in order to set the data within it to 
     * the users specifications
     */
    public void setNext(LinearNode<T> node){
        next = node;
    }
    /**
     * Gets the element stored within the next node
     * @return the element stored in the next node
     */
    public T getElement(){
        return element;
    }
    /**
     * Sets the elements within the node to what the user wants
     * @param elem requires an element in order to set the Nodes data
     */
    public void setElement(T elem){
        element = elem;
    }

    /**
     * the toString of the LinerNode class
     * @return the basic output of the LinearNode class if the user chooses to
     * output
     */
    @Override
    public String toString() {
        return ("LinearNode " + " element = " + element + ", next = " + next);
    }
   
}
