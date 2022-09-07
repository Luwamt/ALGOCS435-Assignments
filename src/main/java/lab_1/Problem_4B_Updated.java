package lab_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Problem_4B_Updated {
    /**
     * 4B program that efficiently sorts the list
     * @param
     *
     */
    public static void sortLinkedList(LinkedList<Integer> list){
//implement
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int firstNum= list.get(i);
                int secondNum= list.get(j);
               if(firstNum > secondNum) {
                   list.set(i, secondNum);
                   list.set(j, firstNum);
               }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>
                (Arrays.asList(20,85,1,3,52,9,17,7,8,100,0,5,14,13));
        sortLinkedList(list);
        for (Integer print : list){
            System.out.print(print + " ");
        }
    }
}
