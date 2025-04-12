import java.util.Scanner;

class PrintMatrix_TwoDArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int rows = input.nextInt();
         int column = input.nextInt();
         int[][] number = new int[rows][column];
         //input
         //rows
         for(int i=0; i<rows ; i++){
             //columns
              for(int j=0 ; j<column ; j++){
                number[i][j] = input.nextInt();
            }
         }
         //output
         for(int i=0 ; i<rows ; i++){
             for(int j=0 ;j<column ; j++){
                 System.out.print(number[i][j]+" ");
             }
             System.out.println();
         }
     }
}
