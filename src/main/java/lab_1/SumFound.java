package lab_1;

public class SumFound {


 public static boolean sumFound(int[] arr, int z){
  if(arr==null || arr.length <2) {
   return false;
  }

  for (int i = 0; i < arr.length-2; i++) {
   if(arr[i]!=arr[i+1]) {
    z = arr[i] + arr[i + 1];
    return true;
   }else
     return false;
  }

  return  false;

 }

 public static void main(String[] args) {

  System.out.println(sumFound(new int[]{1,4,2,3},5));
  System.out.println(sumFound( new int[] {3,3,4,7},6));
  System.out.println(sumFound(new int[]{1},2));
  System.out.println(sumFound(new int[] {8,10,2,3},13));


 }
}
