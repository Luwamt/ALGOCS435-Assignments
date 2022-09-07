package lab_1;

import java.util.ArrayList;
import java.util.List;

public class Problem_8 {
    public static int smallestCommon(int x, int y) {
//implement
        if(x==0||y==0) return 0;
        if(y%x ==0)  return y;
        if (x%y ==0) return  x;
        int multiple = x*y;
        int   lcm =0;
        List<Integer> factorsOfProduct = factorOfProductAdd(multiple);
        for (int i = 0; i < factorsOfProduct.size(); i++) {
            if(factorsOfProduct.get(i) %x == 0 &&
                    factorsOfProduct.get(i) % y == 0 ) {
                lcm=factorsOfProduct.get(i);
                break;
            }
        }
        return lcm;
        }
        public  static List<Integer> factorOfProductAdd(int product){
        List<Integer> factor= new ArrayList<>();
        factor.add(1);
        for (int i = 2; i < product/2; i++) {
             if(product % i ==0){
                 factor.add(i);
             }
            }
            factor.add(product);
        return factor;
    }

    public static void main(String[] args) {
        System.out.println(smallestCommon(4,6));
        System.out.println(smallestCommon(3,5));
        System.out.println(smallestCommon(7,14));
        System.out.println(smallestCommon(10,2));
    }
}
//        int absNumber1 = Math.abs(x);
//        int absNumber2 = Math.abs(y);
//        int absHigherNumber = Math.max(absNumber1, absNumber2);
//        int absLowerNumber = Math.min(absNumber1, absNumber2);
//        int lcm = absHigherNumber;
//        while (lcm % absLowerNumber != 0) {
//            lcm += absHigherNumber;
//        }
//        return lcm;
//        if(y==0) return x;
 //return smallestCommon(y,x%y);
//