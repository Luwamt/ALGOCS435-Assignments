package lab_1;

import java.util.Arrays;
import java.util.List;

public class Problem_3 {
    /**
     *
     * @param list
     * @param z
     * @return
     */

    public static boolean subsetSum(List<Integer> list, Integer z) {
        return isSubsetSum(list, list.size(), z);
    }

    private static boolean isSubsetSum(List<Integer> list,
                                       int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;

        /**
         * If last element is greater than
         *  sum, then ignore it
          */

        if (list.get(n - 1) > sum)
            return isSubsetSum(list, n - 1, sum);

        /**
         *   check if sum can be obtained
            by any of the following
            (a) including the last element
            (b) excluding the last element
         */
        return isSubsetSum(list, n - 1, sum)
                || isSubsetSum(list, n - 1, sum - list.get(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(subsetSum(Arrays.asList(1, 3, 9, 4, 8, 5), 21));
        System.out.println(subsetSum(Arrays.asList(1, 3, 9, 4, 8, 5), 22));
        System.out.println(subsetSum(Arrays.asList(1, 3, 9, 4, 8, 5), 31));
        System.out.println(subsetSum(Arrays.asList(1, 3, 9, 4, 8, 5), 0));
    }
}
