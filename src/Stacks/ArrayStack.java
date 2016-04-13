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
 * @author C0416146 Peter Hillar
 */
public class ArrayStack<T> implements StackADT<T> {

    protected final int DEFAULT_SIZE = 10;
    protected T[] stackArray;
    protected int top;

    /**
     * The default constructor of ArrayStack that initializes everything to 0
     */
    public ArrayStack() {
        stackArray = (T[]) (new Object[DEFAULT_SIZE]);
        top = 0;
    }

    /**
     * The 2nd constructor of ArrayStack that is used to create a stack of
     * patients or beds
     *
     * @param initialSize sets the initial size of the ArrayStack to be used
     */
    public ArrayStack(int initialSize) {
        top = 0;
        stackArray = (T[]) (new Object[initialSize]);
    }

    /**
     * Expands the capacity of the array by copying the current array over and
     * creating more space for more objects to be added to the array
     */
    private void expandCapacity() {
        T[] larger = (T[]) (new Object[stackArray.length + DEFAULT_SIZE]);
        System.arraycopy(stackArray, 0, larger, 0, stackArray.length);
        stackArray = larger;
    }
    /**
     * 
     * @param topCopy takes the top element of the stack and copies it, to another array
     * so that the copied array can be used to output lists
     * @param arrayCopy duplicates the stack so that there are two stacks and allows it to be
     * used a stack to display current information without losing the original stack
     * @param arrayLength copies the length of the original stack to make sure that
     * the copied array has the same length has the original stack
     */
    protected ArrayStack(int topCopy, T[] arrayCopy, int arrayLength) {
        this.top = topCopy;
        this.stackArray = (T[]) (new Object[arrayLength]);
        for (int i = 0; i < arrayCopy.length; i++) {
            this.stackArray[i] = arrayCopy[i];
        }
    }
   /**
    * 
    * @return returns the copied stack of the original stack to be used for output
    */
    public ArrayStack<T> copyStack() {
        return new ArrayStack<>(this.top, this.stackArray, stackArray.length);
    }

    @Override
    /**
     * Checks to see if the stack created is empty or contains objects
     */
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    /**
     * Takes a look at the top element of the array and throws an exception if
     * the stack is empty
     */
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack is Empty");
        }
        return stackArray[top - 1];
    }

    @Override
    /**
     * Removes the top element of the stack and returns its value to the user it
     * throws and exception if the stack is empty
     */
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack is Empty");
        }
        top--;
        T result = stackArray[top];
        stackArray[top] = null;
        return result;
    }

    @Override
    /**
     * Adds an element to the stack and expands the size of the stack each time
     * a new object is added
     */
    public void push(T element) {
        if (size() == stackArray.length) {
            expandCapacity();
        }
        stackArray[top] = element;
        top++;
    }

    @Override
    /**
     * returns the size of the stack
     */
    public int size() {
        return top;
    }

    @Override
    /**
     * the default output of the ArrayStack class that allows the user to see
     * how many patients are inside the stack
     */
    public String toString() {
        return "The current number of patients are: " + size() + " ";
    }
}
