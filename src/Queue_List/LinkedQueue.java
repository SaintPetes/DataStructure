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
public class LinkedQueue<T> implements QueueADT<T> {
    protected int count;
    protected LinearNode<T> front, rear;

    /**
     * The default constructor of LinkedQueue that initializes the LinkedQueue
     * to null and count to 0
     */
    public LinkedQueue() {
      front = rear = null;
      count = 0;
    }
    /**
     * Creates a copy of the LinkedQueue in order for it to be manipulated
     * without destroying the original LinkedQueue
     * @return returns the original LinkedQueue but copied over
     */
    public LinkedQueue<T> copyQueue(){
        return new LinkedQueue<>(front);
    }
    /**
     * A protected function of the LinkedQueue program that allows the original
     * LinkedQueue to be copied over and a copy created of the exact original to 
     * be used by the user in order in to display the contents or any necessary 
     * functions
     * @param frontCopy the copy of the array requires an element in the front of queue to be
     * in check before copying the array over to be used
     */
    protected LinkedQueue(LinearNode<T> frontCopy){
        this.rear = this.front = new LinearNode<>();
        this.count = 1;
        LinearNode<T> temp = frontCopy; //sets a temp node to take the front of the Queue
        while (temp.getNext() != null){ //traverses the Queue to set the elements
            rear.setElement(temp.getElement());
            temp = temp.getNext();
            rear.setNext(new LinearNode<>());
            rear = rear.getNext();
            count++; //sets the size of the LinkedQueue
        }
        rear.setElement(temp.getElement());
    }
    /**
     * Removes an element from the queue, and returns its value while reducing
     * the count of the LinkedQueue
     * @return Returns the value stored in the queue
     * @throws EmptyCollectionException 
     */
    @Override
    public T dequeue()throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Queue");
        T result = front.getElement();
        front = front.getNext();
        count--;
        if(isEmpty())
            rear = null;
        return result;
    }
    /**
     * Returns the first element in the queue
     * @return takes the first element in the queue and returns it
     * @throws EmptyCollectionException 
     */
    @Override
    public T first() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Queue");
        return front.getElement();
    }
    /**
     * Adds an element to the queue, it gets placed at the back.
     * @param element takes a nodes element and adds the node to the rear
     * of the queue
     */
    @Override
    public void enqueue(T element){
        LinearNode<T> node = new LinearNode<>(element);
        if (isEmpty())
            front = node;
        else 
            rear.setNext(node);
        rear = node;
        count++;
    }
    /**
     * Checks to see if the queue if empty
     * @return the queue if it is empty it returns the True
     */
    @Override
    public boolean isEmpty(){
        return (count == 0);
    }
    /**
     * After each function is run, a count is done to keep track of the size
     * of the LinkedQueue
     * @return the size of the LinkedQueue
     */
    @Override
    public int size(){
        return count;
    }
    /**
     * The toString of the LinkedQueue, outputs the LinkedQueue if needed
     * @return the result of the toString, which is the LinkedQueue
     */
    @Override
    public String toString(){
        String result = " "; 
        LinearNode<T> current = front;
        while(current != null)
        {
        result = result + (current.getElement()).toString() + "\n";
        current = current.getNext();
        }
        return result;
    }
    
    
}
