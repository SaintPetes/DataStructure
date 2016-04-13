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
public interface StackADT<T> {
    public boolean isEmpty();
    public T peek()throws EmptyCollectionException;
    public T pop()throws EmptyCollectionException;
    public void push(T element);
    public int size();
    public String toString();
    
}
