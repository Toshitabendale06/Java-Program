import java.util.Scanner;

/* copy Array Elements*/
//First a[]=10,20,30 ---------> Second b[] = 10,20,30
class CopyArrayElement {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int[] a = new int[5];
         int[] b = new int[5];

         System.out.print("Enter 5 array element ");
         for(int i=0 ; i<a.length ; i++){
             a[i] = input.nextInt();
         }
         System.out.print("First array element = ");
         for(int i=0 ; i<a.length ; i++ ){
             System.out.print(a[i]+" ");
         }
         //Second Array
         System.out.println();
         System.out.print("copy all array element in second array = ");
         for(int i=0 ; i<a.length ; i++ ){
             b[i] = a[i];
             System.out.print(b[i]+" ");
         }
     }
}
