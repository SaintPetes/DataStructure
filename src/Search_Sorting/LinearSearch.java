/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search_Sorting;

/**
 *
 * @author xxped
 */
public class LinearSearch {

    int[] data;
    int size;

    public boolean LinearSearch(int key) {

        int index = 0;
        while (index < size) {
            if (data[index] == key) {
                return true;
            }
            if (data[index] < key) {
                return false;
            }
            index++;
        }
        return false;
    }

}
