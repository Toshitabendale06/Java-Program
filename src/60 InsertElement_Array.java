import java.util.Scanner;

//Insert element in array
   //ex = [10,20,30];
   //local 1 =40;
   //[10,40,20,30];
class InsertElement_Array {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int size ,loc,i ,item;
         System.out.print("Enter array size: ");
         size = input.nextInt();

         int arr[] = new int[size+1];
         System.out.print("Enter array element: ");
         for( i=0 ; i<size ; i++){
             arr[i] = input.nextInt();
         }
         System.out.print("Enter array location: ");
         loc= input.nextInt();
         System.out.print("Enter new item: ");
         item= input.nextInt();

         for( i=size ; i>loc ; i-- ){
             arr[i]=arr[i-1];
         }
         arr[loc]=item;
          size++;
          for( i=0 ;i<size ; i++){
              System.out.print(arr[i]+" ");
          }
     }
}
