import java.util.Scanner;

class SumofArrayElement {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a[] = new int[5];
         int sum=0;
         System.out.print("Enter the array element ");
         for(int i=0 ; i<a.length ; i++){
             a[i] = input.nextInt();
         }
         System.out.print("First array element = ");
         for(int i=0 ; i<a.length ; i++ ){
             System.out.print(a[i]+" ");
             sum = a[i]+sum;
         }
         System.out.println("\nAddition of array element = "+sum);
     }
}
