import java.util.Scanner;

class ArrangeArrayElement_AscendingOrder {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int arr[] = new int[5];
         System.out.print("Enter the array element");
         for(int i=0 ; i<arr.length ; i++){
             arr[i] = input.nextInt();
         }
         //ex = 14,10,20,30,40
         System.out.print("Ascending order of array element are = ");
         for(int i=0 ; i<arr.length ; i++){      //1 bar cahle ga 1 time pe ex i=0
             for(int j=i+1 ; j<arr.length ; j++){   //ye 4 bar cahle ga 1 time pe  ex j=0+1=1
                 if(arr[i]>arr[j]){  //14 > 10
                     int temp =arr[i];  //tem = 14
                     arr[i] = arr[j];   //a[0] = 10
                     arr[j] =temp;     //a[1]= 14
                 }   //10,14,20,30,40
             }
         }
         for(int i=0 ; i<arr.length ; i++){
             System.out.print(arr[i]+" ");
         }

     }
}
