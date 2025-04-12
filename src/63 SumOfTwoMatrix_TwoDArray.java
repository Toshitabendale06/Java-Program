import java.util.Scanner;

class SumOfTwoMatrix_TwoDArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter rows size: ");
         int rows = input.nextInt();
         System.out.print("Enter column size: ");
         int col = input.nextInt();
              //first array
         System.out.println("Enter first matrix");
         int arr[][] = new int[rows][col];
         for(int i=0 ; i<rows ; i++){
             for(int j=0 ; j<col ; j++){
                 arr[i][j] = input.nextInt();
             }
         }
               //second array
         System.out.println("Enter second matrix");
         int arr2[][] = new int[rows][col];
         for(int i=0 ; i<rows ; i++){
             for(int j=0 ; j<col ; j++){
                 arr2[i][j] = input.nextInt();
             }
         }
            //third array for sum
         int c[][] =new int[rows][col];
         System.out.println("Sum of two matrix : ");
         for(int i=0 ; i<rows ; i++){
             for(int j=0 ; j<col ; j++){
                 c[i][j] = arr[i][j]+arr2[i][j];
                 System.out.print(c[i][j]+" ");
             }
             System.out.println();
         }
     }
}
