/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search_Sorting;

import Stacks.Patient;

/**
 *
 * @author xxped
 */
public class BinarySearch {

    public BinarySearch() {

    }

    public Patient BinarySearch(Patient[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid].getPriority()) {
                hi = mid - 1;
            } else if (key > a[mid].getPriority()) {
                lo = mid + 1;
            } else {
                return a[mid];
            }
        }
        return null;
    }
}
