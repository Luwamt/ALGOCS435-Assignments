package lab_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem_4A_Updated {
    /**
     * 4A program that efficiently sorts the list
     * @param list
     * sorting using arrayList is more efficient than sorting
     * using linkedList because Arraylist is randomly access
     * so the methods get and set are a constant time
     * but in the linkedList are O(n).
     */
    public static void sortArrayList(ArrayList<Integer> list) {
//implement
       //smallest = list.get(0);
        int index=0;
        for ( int i = 0 ; i < list.size() ; i++) {
            int smallest = list.get(i);
            index = i;

            for (int j = i + 1 ; j < list.size(); j++) {
                if (list.get(j) < smallest) {
                    smallest = list.get(j);
                    index = j;
                }
            }

            list.set(index, list.get(i));
            list.set(i, smallest);
        }


        // Check with every the outer index , first with index 1,2,3...
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>
                (Arrays.asList(20,85,1,3,52,9,17,7,8,100,0,5,14,13));
        sortArrayList(list);
        for (Integer print : list){
            System.out.print(print + " ");
        }
    }
}