import java.util.Arrays;
class PrintArrayUsing_ArrayClassMethod {
     public static void main(String[] args) {
         String a[] = {"Hello","my","name","is","Toshita"};

         //For single arrays
         System.out.println("toString() method = "+Arrays.toString(a));
         System.out.println("asList() method = "+Arrays.asList(a) );

         //For 2-D array or multidimensional array
         int arr[][] = {{10,20,30},{10,20}};
         System.out.println("deepToString() method = "+Arrays.deepToString(arr));
     }
}
