import java.util.Scanner;

class ArrangeArrayElement_DecendingOrder {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int[] arr = new int[5];
         int temp;
         System.out.print("Enter the array element = ");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }
         //ex = 4,3,7,2,9  ---->9,7,4,3,2
         for(int i=0 ; i<arr.length ; i++){ //i=0
             for(int j=i+1 ; j<arr.length ; j++){
                 if(arr[i]<arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         for(int i=0 ; i<arr.length ; i++){
             System.out.print("Decending order of array "+arr[i]+" ");
         }
     }
}
