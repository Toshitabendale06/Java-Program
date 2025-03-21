import java.util.Scanner;

class PrintArrayElement_ReverseOrder {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int arr[] = new int[5];
         System.out.print("Enter the array element ");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }

         System.out.print("Print array element = ");
         for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
         }

         System.out.println();
         System.out.print("print array element in reverse order = ");
         for(int i=arr.length-1 ; i>=0 ; i--){

             System.out.print(arr[i]+" ");

         }
     }
}
