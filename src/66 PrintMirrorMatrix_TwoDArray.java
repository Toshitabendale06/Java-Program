import java.util.Scanner;
//array martix: 10 20
//              30 40
// Mirror marrix:20 10
//                40 30
class PrintMirrorMatrix_TwoDArray {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Enter rows size: ");
         int rows = input.nextInt();
         System.out.print("Enter column size: ");
         int col = input.nextInt();
         //input array
         System.out.println("Array matrix");
         int arr[][] = new int[rows][col];
         for(int i=0 ; i<rows ; i++){
             for(int j=0 ; j<col ; j++){
                 arr[i][j] = input.nextInt();
             }
         }
         //output
         System.out.println("Mirror matrix");
         for(int i=0 ; i<rows ; i++){
             for(int j=1 ; j>=0 ; j--){
                 System.out.print( arr[i][j]+" ");
             }
             System.out.println();
         }
     }
}
