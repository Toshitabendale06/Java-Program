import java.util.Scanner;

class FindLengthOfArray {
     public static void main(String[] args) {
         int a[] = new int[5];
         Scanner input = new Scanner(System.in);

         System.out.println("Enter 5 elements in array = ");
         for(int i=0 ; i<a.length ; i++){
             a[i] = input.nextInt();
         }

         System.out.print("Array elements are  = ");
         for(int i=0 ; i<a.length ; i++){
             System.out.print(a[i]+" ");
         }
         System.out.println();
         System.out.println("Array length = "+a.length);
     }
}
