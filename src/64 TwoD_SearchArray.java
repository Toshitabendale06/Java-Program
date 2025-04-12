import java.util.Scanner;

class TwoD_SearchArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter rows size: ");
         int rows = input.nextInt();
         System.out.print("Enter column size: ");
         int col = input.nextInt();

         int arr[][] = new int[rows][col];

         System.out.println("Array Matrix : ");
         for(int i=0 ;i<rows ; i++){
             for(int j=0 ; j<col ;j++){
                 arr[i][j] = input.nextInt();
             }
         }
         System.out.print("enter element to search: ");
       int x = input.nextInt();
         for(int i=0 ;i<rows ; i++){
             for(int j=0 ; j<col ;j++){
                 if(arr[i][j] == x){
                     System.out.println("X found at location: "+i+","+j);
                 }
             }
         }
     }
}
