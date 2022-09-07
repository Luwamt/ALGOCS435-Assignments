package lab_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Problem_4_A {
    public static void sortMethod(ArrayList<Integer> list){
        sortArrayList(list, list.size());
    }
    /**
     * 4A program that efficiently sorts the list
     *
     * @param list
     */
    public static void sortArrayList(ArrayList<Integer> list, int n) {
//implement
        // Base case
        if (n <= 1)
            return;
        // Sort first n-1 elements
        sortArrayList(list, n - 1);

        /**
         *  Insert last element at its correct position
         *  in sorted array.
          */

        int last = list.get(n-1);
        int j = n-2;
        /**
         * Move elements of arr[0..i-1], that are
         * greater than key, to one position ahead
         * of their current position
         */
//        for (int i = 0; i < list.size(); i--) {
//            System.out.println(list.get(i));
//        }
        while (j >= 0 && list.get(j) > last)
        {
            list.set(j+1, list.get(j));
            j--;
        }
        list.add(j+1, last);
    }
        /**
         * 4B program that efficiently sorts the list
         * @param
         */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 6, 9, 2));;
        sortMethod(arr);
        System.out.println(arr);

    }
    }


