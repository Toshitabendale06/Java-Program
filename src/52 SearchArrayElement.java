import java.util.Scanner;

class SearchArrayElement {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int arr[] = new int[5];
         System.out.print("Enter the array element");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }
         System.out.print("Array element are =");
         for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
         }

         System.out.print("\nSearch Element = ");
         int n = input.nextInt();
         for(int i=0 ; i<arr.length ; i++){
             if(arr[i] == n){
                 System.out.print("\nArray found at index "+i);
             }
         }
     }
}
