import java.util.Scanner;

class AverageOf_ArrayElement {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int arr[] = new int[5];
         int sum = 0;
         System.out.print("Enter the array element");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }
         System.out.print("Array element are =");
         for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
             sum = arr[i]+sum;
         }
         double avg =sum/5;
         System.out.print("\nAverage of Array elements " +avg);
     }
}
