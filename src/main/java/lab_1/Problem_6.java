package lab_1;

import lab1.powerset.PowerSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Problem_6 {
//    public static List<Set> powerSet(List list) {
//implement
        public static List<Set<Integer>> powerSet(List<Integer> list) {
            return PowerSet.powerSet(list);
        }


        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(){{
                add(1);
                add(2);
//                add(23);
//                add(1);
//                add(15);
//                add(6);
//                add(6);
            }
            };
            System.out.println(powerSet(list));
        }
    }


//    public static boolean subsetSum(List<Integer> list, Integer z) {
//        List<Set<Integer>> P = PowerSet.powerSet(list);
//        //implement
//        return false;
//    }