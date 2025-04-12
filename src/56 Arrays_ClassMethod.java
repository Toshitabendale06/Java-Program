import java.util.Arrays;
import java.util.Scanner;

//sort() equals() copyOf()
 class Arrays_ClassMethod {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int arr[] =new int[5];
         int arr2[]=new int[5];
         System.out.print("Enter array element");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }
         System.out.print("Enter array2 element");
         for(int i=0 ; i<arr.length ; i++){
             arr2[i] = input.nextInt();
         }
         //equals()
         System.out.println("equals() method");
         boolean b = Arrays.equals(arr,arr2);
         System.out.println("Is Both array are equal check by using equals() method ="+b);
         //sort()
         System.out.println("sort() method");
         Arrays.sort(arr);
         for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
         }
         //copyOf()
         System.out.println();
         System.out.println("copyof() method");
         int arr3[] =Arrays.copyOf(arr,5);
         for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr2[i]+" ");
         }

     }
}
