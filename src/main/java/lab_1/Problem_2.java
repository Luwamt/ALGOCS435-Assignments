package lab_1;

public class Problem_2 {
    public static int secondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int smallest=arr[0];
        int secondSmall=arr[1];

        if(secondSmall< smallest){
            int temp= smallest;
            smallest=secondSmall;
            secondSmall=temp;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest ) {
                secondSmall=smallest;
                smallest = arr[i];
            }else if (arr[i] < secondSmall)
                secondSmall=arr[i];
        }
        System.out.println("Second smallest: "+secondSmall
                + "\nSmallest: " + smallest + "\n----");
        return secondSmall;
    }

    public static void main(String[] args) {
        secondSmallest(new int[]{1, 4, 2, 3});
        secondSmallest(new int[]{3, 3, 4, 7});
        secondSmallest(new int[]{5, 3, 4, 7});
        secondSmallest(new int[]{9});
    }
}
