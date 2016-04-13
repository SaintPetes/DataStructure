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
 * The interface that is used by the LinkedList class
 * it acts as a blueprint for the class so that it has the correct methods
 * implemented 
 * @author C0416146 Peter Hillar
 */
public interface ListADT<T> {
    public T removeFirst();
    public T removeLast();
    public T first();
    public T last();
    public boolean isEmpty();
    public int size();
    public String toString();
    public void addFirst(T element);
    public void addLast(T element);
}
