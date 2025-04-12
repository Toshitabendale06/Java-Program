import java.util.Scanner;

                   //array martix: 10 20
                   //              30 40
                   // Transpose marrix:10 30 (row ek elemet ko col me dal diye )
                   //                 20 40
class PrintTransposeOfMatrix_TwoDArray {
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
         System.out.println("Transpose matrix");
         for(int i=0 ; i<rows ; i++){
             for(int j=0 ; j<col ; j++){
                 System.out.print( arr[j][i]+" ");
             }
             System.out.println();
         }
     }
}
