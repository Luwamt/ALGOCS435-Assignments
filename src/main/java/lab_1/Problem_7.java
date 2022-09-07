package lab_1;

public class Problem_7 {
    /**
     * find the Fibonacchi
     */

    public static int generate(int n) {
        int count = 0;
        if(n == 0) return  0;
        if(n == 1) return 1;

//implement
        return generate(n - 1) + generate(n - 2);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; ++i) {
            System.out.print(generate(i)+ " ");
        }
    }
}
