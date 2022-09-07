package lab_1;

import lab1.powerset.PowerSet;

import java.util.List;
import java.util.Set;

public class Chweck {
    static boolean isSubsetSum(int set[],
                               int n, int sum)
    {

        if (sum == 0)
            return true;
        if (n == 0)
            return false;


        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);


        return isSubsetSum(set, n - 1, sum)
                || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }


    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }

    public static boolean sumFound(List list, int k) {


        List<Set<Integer>> powerset = PowerSet.powerSet(list);
        System.out.println(powerset);
        return false;
    }
}
