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
 * @param <T>
 */
public class LinkedList<T> implements ListADT<T> {

    protected int count;
    protected LinearNode<T> head, tail;
    protected LinkedList<T> bedList;

    /**
     * The default constructor of the LinkedList, it initializes everything to 
     * null and 0
     */
    public LinkedList() {
        head = tail = null;
        count =  0;
    }
   
    /**
     * Removes the first element in the LinkedList 
     * @return gets the data within the node and outputs it after it has been
     * removed
     * @throws RuntimeException if an error occurs 
     */
    @Override
    public T removeFirst() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("List");
        }
        LinearNode<T> result = head;
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        count--; //keeps track of the size
        return result.getElement();
    }

    /**
     * Removes the last element in the LinkedList
     * @return gets the last element in the LinkedList and returns it as it
     * is removed from the list
     * @throws RuntimeException if an error occurs
     */
    @Override
    public T removeLast() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("List");
        }
        LinearNode<T> previous = null;
        LinearNode<T> current = head;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        LinearNode<T> result = tail;
        tail = previous;
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--; //keeps track of size
        return result.getElement();
    }
    
    /**
     * 
     * @return gets the first element in the linked list by returning what the 
     * head is pointing to
     */
    @Override
    public T first() {
        return head.getElement();
    }

    /**
     * 
     * @return gets the last element in the linked list by returned what the tail
     * is pointing to
     */
    @Override
    public T last() {
        return tail.getElement();
    }
    /**
     * Checks to see if the LinkedList is empty
     * @return returns true if the list in empty
     */
    @Override
    public boolean isEmpty() {
        return (count == 0);
    }
    /**
     * Has a count to keep track of the size of the LinkedList
     * @return gets the size of the LinkedList, each time an element is added
     * or removed a count if done to change the size of the LinkedList
     */
    @Override
    public int size() {
        return count;
    }
    /**
     * Uses the protected method and creates the copy of the original
     * LinkedList and allows it to be used by other classes without
     * destroying the original function
     * @return gets the copy of the original LinkedList
     */
    public LinkedList<T> copyList(){
        return new LinkedList<>(head);
    }
    /**
     * A protected copy function that creates a copy of the original LinkedList
     * and allows it to be used by the user to display the contents or make changes
     * without affecting the original LinkedList
     * @param headCopy takes the head and creates a copy by the using a temp node
     * to traverse the LinkedList copying the elements over
     */
    protected LinkedList(LinearNode<T> headCopy){
        this.tail = this.head = new LinearNode<>();
        this.count = 1;
        LinearNode<T> temp = headCopy; //Sets a temp node to the head node
        while (temp.getNext() != null){ //traverses the LinkedList copying the
            tail.setElement(temp.getElement());//elements over
            temp = temp.getNext();
            tail.setNext(new LinearNode<>());
            tail = tail.getNext();
            count++;//Keeps track of the size of the copied LinkedList
        }
        tail.setElement(temp.getElement());
     }
    /**
     * The toString of the LinkedList that produces an output if called upon
     * by the user
     * @return the data stored in the LinkedList
     */
    @Override
    public String toString() {
        LinearNode<T> current = head;
        String result = "";
        while (current != null) {
            result = result + (current.getElement()).toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

   /**
    * Adds an element to the back of the list using the tail
    * @param element requires an element to be inserted into the tail end of the
    * LinkedList, keeps track of the size using count
    */
    @Override
    public void addLast(T element) {
        if (isEmpty()){
            tail = new LinearNode(element);
            head = tail;
        } else {
         LinearNode<T> temp = tail;
         tail = new LinearNode<>(element);
         tail.setNext(temp);
         tail = tail.getNext();
        }
        count++; //Keeps track of the size
    }
    /**
     * Adds and element to the front of the portion of the LinkedList
     * @param element requires and element in order to insert a node into the head
     * end of the LinkedList, keeps track of size using count
     */
    @Override
    public void addFirst(T element) {
        if (head == null) {
            head = new LinearNode(element);
            tail = head;
        }else{
            LinearNode<T> temp = head;
            head = new LinearNode<>(element);
            head.setNext(temp);
        }
        

        count++;//Keeps track of the size
    }
}
