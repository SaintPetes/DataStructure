/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue_List;

/**
 *
 * @author xxped
 */
public class EmptyCollectionException extends Exception {

    /**
     * Creates a new instance of <code>EmptyCollectionException</code> without
     * detail message.
     */
    public EmptyCollectionException() {
        super("The list is empty");
    }

    /**
     * Constructs an instance of <code>EmptyCollectionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyCollectionException(String msg) {
        super("The queue is Empty" + msg);
    }
}
