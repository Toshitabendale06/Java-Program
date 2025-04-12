import java.util.Scanner;

   //Delete array element
  //ex=[10,20,30,40]
   //loc = 2;
  //new =[10,20,40];
class DeleteElement_Array {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int size,loc;
         System.out.print("Enter the array size: ");
         size = input.nextInt();

         int arr[] = new int[size];
         System.out.print("Enter array element : ");
         for(int i=0 ; i<size ; i++){
             arr[i] = input.nextInt();
         }
         System.out.print("Enter array location for delete: ");
         loc=input.nextInt();
         for(int i=loc ; i<size-1 ; i++){
             arr[i] = arr[i+1];
         }
          size--;
         for(int i=0 ; i<size ; i++){
             System.out.print(arr[i]+" ");
         }
     }
}
