package lab_1;

public class Problem_5 {

    /**
     * 5-A
     *
     * @param
     */

    public static boolean find(int[] arr, int z) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z)
                return true;
        }
        return false;
    }

    /**
     * 5-B
     * Yes, we can use Binary Search tree
     * which is o(log n)  which more efficient
     * than problem A (linear Search) which is o(n).
     * Check binary Search using Recursion
     * @param
     */
    public static int binarySearch(int[] arr, int key, int low,int high) {
        int mid = low+ ((high - low) / 2);
        if (high < low) {
            return -1;
        }
        if (key == arr[mid]) {
            return mid;
        } else if (key > arr[mid]) {
            return binarySearch(arr, key, mid + 1, high);
        } else {
            return binarySearch(arr, key, low, mid - 1);

        }
    }
    public static void main(String[] args) {
        /**
         * Check using Linear search
         */
        System.out.println(find(new int[]{2, 8, 3, 4}, 3));
        System.out.println(find(new int[]{2, 8, 3, 4}, 5));
        System.out.println(find(new int[]{2, 3, 4, 8}, 3));
        System.out.println(find(new int[]{2, 3, 4, 8}, 5));
/**
 * Check using Binary search
 */
int[] arr =new int[]{2, 8, 3, 4};
int last= arr.length;
int[] arr2 =new int[]{2, 8, 3, 4,4};
 int last2 =arr2.length;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(binarySearch(arr, 3,0,last));
        System.out.println(binarySearch(arr2, 1,0,last2));
        //System.out.println(binarySearch(new int[]{2, 3, 4, 8}, 3));
       // System.out.println(binarySearch(new int[]{2, 3, 4, 8}, 5));
    }
}//    public static int binarySearch(int[] arr, int z){
//        int first=0;
//        int last= arr.length;
//        int mid =0;
//        while (first <= last){
//            mid=(first+last)/2;
//            //System.out.println(mid + " = " + last + " + " + first + " / 2");
//        if (z==arr[mid]){
//            return mid;
//        }else  if (z > arr[mid]){
//            System.out.println(z + " is greater than " + arr[mid]);
//            first = mid + 1;
//        } else {
//            System.out.println(z + " is less than " + arr[mid]);
//            last = mid - 1;
//        }
//        }
// return mid;
//}